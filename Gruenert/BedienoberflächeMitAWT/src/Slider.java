import java.awt.*;

public class Slider extends Frame {
	//FlowLayout fl = new FlowLayout();
	Scrollbar bar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 0, 1, 100);

	Slider(String title) 
	{
		super(title);
		//setLayout(fl);
		add(bar);

	}

}
