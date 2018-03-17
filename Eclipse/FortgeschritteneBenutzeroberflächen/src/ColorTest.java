
import java.awt.*;

public class ColorTest extends java.applet.Applet {
	Canvas swatch;
	ColorControls RGBControl, HSBControl;
	
	public void init() {
		GridLayout grid = new GridLayout(1, 3, 5, 15);
		swatch = new Canvas();
		swatch.setBackground(Color.BLACK);
		RGBControl = new ColorControls(this, "Red", "Green", "Blue");
		HSBControl = new ColorControls(this, "Hue", "Saturation", "Brightness");
		setLayout(grid);
		add(swatch);
		add(RGBControl);
		add(HSBControl);
		
	}

	
	 void update(ColorControls controlPanel) {
		 int value1 = Integer.parseInt(controlPanel.tf1.getText());
		 int value2 = Integer.parseInt(controlPanel.tf2.getText());
		 int value3 = Integer.parseInt(controlPanel.tf3.getText());
		 Color c;
		 
		 if (controlPanel == RGBControl) {	//RGB has changed, update HSB and color
			 c = new Color(value1, value2, value3);
			 float [] HSB = Color.RGBtoHSB(value1, value2, value3, new float[3]);
			 HSB[0] *= 360;
			 HSB[1] *= 100;
			 HSB[2] *= 100;
			 HSBControl.tf1.setText(String.valueOf((int)HSB[0]));
			 HSBControl.tf2.setText(String.valueOf((int)HSB[1]));
			 HSBControl.tf3.setText(String.valueOf((int)HSB[2]));
		 } else {			//HSB has changed, update RGB and color
			 c = Color.getHSBColor((float) value1 / 360, (float) value2 / 100, (float) value3 / 100);
			 RGBControl.tf1.setText(String.valueOf(c.getRed()));
			 RGBControl.tf2.setText(String.valueOf(c.getGreen()));
			 RGBControl.tf3.setText(String.valueOf(c.getBlue()));
		 }
		 
		 swatch.setBackground(c);
		 
	 }
}
