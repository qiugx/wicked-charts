
package de.adesso.wickedcharts.chartjs.chartoptions.colors;

/**
 * Defines the color as a string.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/general/colors.html">http://www.chartjs.org/docs/latest/general/colors.html</a>
 *
 * @author SvenWirz
 */
public class StringValueColor extends Color {

	private String colorname;
	
	public String getColorname() {
		return colorname;
	}

	public void setColorname(String colorname) {
		this.colorname = colorname;
	}

	public StringValueColor(String string) {
		this.colorname = string;
	}
	
}
