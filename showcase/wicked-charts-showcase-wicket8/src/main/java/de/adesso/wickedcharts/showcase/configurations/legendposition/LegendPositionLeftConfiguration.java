
package de.adesso.wickedcharts.showcase.configurations.legendposition;

import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

/**
 * Shows how to configure a chart with the legend position on the left
 *
 * @see <a href="http://www.chartjs.org/samples/latest/legend/positioning.html">http://www.chartjs.org/samples/latest/legend/positioning.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class LegendPositionLeftConfiguration extends LegendPositionChartBasicConfiguration {
	
	public LegendPositionLeftConfiguration() {
		super();
		
		getData().getDatasets().get(0).setBackgroundColor(SimpleColor.YELLOW_TRANSPARENT)
		.setBorderColor(SimpleColor.YELLOW);
		
		getOptions().setLegend(new Legend().setPosition(Position.LEFT));
		
		getOptions().getTitle().setText("Legend Position: Left");
	}
}
