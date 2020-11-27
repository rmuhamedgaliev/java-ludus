package module4;

import java.util.*;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.GeoJSONReader;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.AbstractShapeMarker;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.MultiMarker;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.utils.MapUtils;
import parsing.ParseFeed;
import processing.core.PApplet;

/** EarthquakeCityMap
 * An application with an interactive map displaying earthquake data.
 * Author: UC San Diego Intermediate Software Development MOOC team
 * Exercise completed by Aleksandra Globa
 * Date: July 4, 2020
 * */

public class EarthquakeCityMap extends PApplet {

	private static final long serialVersionUID = 1L;
	private static final boolean offline = true;
	// This is where to find the local tiles, for working without an Internet connection
	public static String mbTilesString = "/Users/rmuhamedgaliev/Projects/Personal/java-ludus/coursera-oop/data/blankLight-1-3.mbtiles";
	//feed with magnitude 2.5+ Earthquakes
	private String earthquakesURL = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.atom";
	// The files containing city names and info and country names and info
	private String cityFile = "/Users/rmuhamedgaliev/Projects/Personal/java-ludus/coursera-oop/data/city-data.json";
	private String countryFile = "/Users/rmuhamedgaliev/Projects/Personal/java-ludus/coursera-oop/data/countries.geo.json";
	private UnfoldingMap map;
	private List<Marker> cityMarkers;
	private List<Marker> quakeMarkers;
	private List<Marker> countryMarkers;
	private HashMap<String, Integer> quakesPerCountry;
	private int oceanCounter = 0;

	public void setup() {
		size(900, 700, OPENGL);
		if (offline) {
			map = new UnfoldingMap(this, 200, 50, 650, 600, new MBTilesMapProvider(mbTilesString));
			earthquakesURL = "/Users/rmuhamedgaliev/Projects/Personal/java-ludus/coursera-oop/data/quiz1.atom";  // The same feed, but saved August 7, 2015
		} else {
			map = new UnfoldingMap(this, 200, 50, 650, 600, new Microsoft.RoadProvider());
		}
		MapUtils.createDefaultEventDispatcher(this, this.map);

		// WHEN TAKING QUIZ: Uncomment the next line
		//earthquakesURL = "quiz1.atom";

		// Load country features and markers
		List<Feature> countries = GeoJSONReader.loadData(this, this.countryFile);
		countryMarkers = MapUtils.createSimpleMarkers(countries);

		// Read in city data
		List<Feature> cities = GeoJSONReader.loadData(this, this.cityFile);
		cityMarkers = new ArrayList<Marker>();
		for(Feature city : cities) {
			cityMarkers.add(new CityMarker(city));
		}

		// Read in earthquake RSS feed
		List<PointFeature> earthquakes = ParseFeed.parseEarthquake(this, earthquakesURL);
		quakeMarkers = new ArrayList<Marker>();

		for(PointFeature feature : earthquakes) {
			if (isLand(feature)) {
				quakeMarkers.add(new LandQuakeMarker(feature));
			} else {
				quakeMarkers.add(new OceanQuakeMarker(feature));
				oceanCounter++;
			}
		}

		// prepare HashMap
		quakesPerCountry = new HashMap<String, Integer>();
		String countryName;
		for (Marker marker: countryMarkers) {
			countryName = marker.getStringProperty("name");

			for (Marker quake: quakeMarkers) {
				if (countryName.equals(quake.getProperty("country"))) {
					quakesPerCountry.put(countryName,quakesPerCountry.get(countryName) == null
						?  1 : quakesPerCountry.get(countryName) + 1);
				}
			}
		}

		printQuakes();

		// NOTE: Country markers are not added to the map.  They are used for their geometric properties
		map.addMarkers(quakeMarkers);
		map.addMarkers(cityMarkers);
	}

	public void draw() {
		background(200, 200, 200);
		map.draw();
		addKey();
	}

	private void addKey() {
		//fill(255, 255, 255);
		text("Earthquake Key", 40, 60);
		text("City Marker", 60, 80);
		text("Land Quake", 60, 105);
		text("Ocean Quake", 60, 130);
		text("Size ~ Magnitude", 60, 155);
		text("Shallow", 60, 185);
		text("Intermediate", 60, 210);
		text("Deep", 60, 235);

		fill(255, 0, 255);
		triangle(40, 80, 50, 80, 45, 70);

		fill(255, 255, 255);
		ellipse(45, 100, 10, 10);

		fill(255, 255, 255);
		rect(40, 120, 10, 10);

		fill(255,255,0);
		ellipse(45, 180, 10, 10);

		fill(0, 0, 255);
		ellipse(45, 205, 10, 10);

		fill(255, 0, 0);
		ellipse(45, 230, 10, 10);
	}

	// Checks whether this quake occurred on land.If it did, it sets the "country" property of its PointFeature to the
	// country where it occurred and returns true.

	private boolean isLand(PointFeature earthquake) {

		for (Marker marker : countryMarkers) {
			if (isInCountry(earthquake, marker)) {
				isInCountry(earthquake, marker);
				return true;
			}
		}
		return false;
	}

	/* prints countries with number of earthquakes as
	 * Country1: numQuakes1
	 * Country2: numQuakes2
	 * ...
	 * OCEAN QUAKES: numOceanQuakes
	 * */

	private void printQuakes() {

		for (Map.Entry<String, Integer> entry : quakesPerCountry.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		System.out.println("OCEAN QUAKES: " + oceanCounter);
	}

	// helper method to test whether a given earthquake is in a given country
	// This will also add the country property to the properties of the earthquake
	// feature if it's in one of the countries.
	// You should not have to modify this code
	private boolean isInCountry(PointFeature earthquake, Marker country) {
		Location checkLoc = earthquake.getLocation();

		// some countries represented it as MultiMarker
		// looping over SimplePolygonMarkers which make them up to use isInsideByLoc
		if(country.getClass() == MultiMarker.class) {

			// looping over markers making up MultiMarker
			for(Marker marker : ((MultiMarker)country).getMarkers()) {
				// checking if inside
				if(((AbstractShapeMarker)marker).isInsideByLocation(checkLoc)) {
					earthquake.addProperty("country", country.getProperty("name"));
					return true;
				}
			}
		}
		// check if inside country represented by SimplePolygonMarker
		else if(((AbstractShapeMarker)country).isInsideByLocation(checkLoc)) {
			earthquake.addProperty("country", country.getProperty("name"));
			return true;
		}
		return false;
	}

	public static void main (String[] args) {
		PApplet.main(module4.EarthquakeCityMap.class.getName());
		EarthquakeCityMap test = new EarthquakeCityMap();
		test.draw();
	}
}