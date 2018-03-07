import java.awt.*;

public class Labels extends Frame {
	GridLayout fl = new GridLayout(3,1);  // 3 Zeilen, 1 Spalte
	Label lefty = new Label("Left");
	Label center = new Label("Center", Label.CENTER);
	Label righty = new Label("Right", Label.RIGHT);
	Font lf = new Font("Courier", Font.BOLD, 14);
			
	Labels(String title) 
	{
		super(title);
		setLayout(fl);
		setFont(lf);
		add(lefty);
		add(center);
		add(righty);
		
	}

}
