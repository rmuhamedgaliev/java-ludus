package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * @author UC San Diego Intermediate Software Development MOOC team
 * Exercise completed by Aleksandra Globa
 * Date: July 4, 2020
 */
public class OceanQuakeMarker extends EarthquakeMarker {

	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		isOnLand = false;
	}


	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		// Drawing a centered square for Ocean earthquakes
		pg.pushStyle();
		getDepthColor(pg);
		pg.rect(x, y, 10 * scaleSize(), 10 * scaleSize());
		pg.popStyle();
		getDepthColor(pg);
	}
}