package fensterAufgaben;

import java.awt.*;

public class DreiButtonsDreiFenster extends Frame {
	GridLayout fl = new GridLayout(3,2);  // 3 Zeilen, 1 Spalte
	Label lefty = new Label("Left");
	Label center = new Label("Center", Label.CENTER);
	Label righty = new Label("Right", Label.RIGHT);
	Font lf = new Font("Helvetica", Font.BOLD, 14);
			
	DreiButtonsDreiFenster(String title) 
	{
		super(title);
		setLayout(fl);
		setFont(lf);
		add(lefty);
		add(center);
		add(righty);
		
	}

}
