package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for land earthquakes on an earthquake map
 * @author UC San Diego Intermediate Software Development MOOC team
 * Exercise completed by Aleksandra Globa
 * Date: July 4, 2020
 */

public class LandQuakeMarker extends EarthquakeMarker {

	public LandQuakeMarker(PointFeature quake) {
		super(quake);
		isOnLand = true;
	}


	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		pg.pushStyle();
		getDepthColor(pg);
		pg.ellipse(x, y, 10 * scaleSize(), 10 * scaleSize());
		pg.popStyle();
	}
	// Get the country the earthquake is in
	public String getCountry() {
		return (String) getProperty("country");
	}
}