import java.awt.*;

public class BaseFrame1 extends Frame {
	BorderLayout fl = new BorderLayout();
	String message = "This is a window";
	Label lab;
			
			
	BaseFrame1(String title) {
		super(title);
		setLayout(fl);
		lab = new Label(message, Label.CENTER);
		Font f = new Font("Helvetica", Font.PLAIN, 12);
		setFont(f);
		add("Center", lab);
		
		
	}

}
