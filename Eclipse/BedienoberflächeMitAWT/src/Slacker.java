import java.awt.*;

public class Slacker extends Frame {
	FlowLayout fl = new FlowLayout();
	String note = "I am extremely tired and would prefer not to be clicked." + 
			" Please interact somewhere else.";
	Button tired = new Button(note);
	
	
	Slacker(String title) 
	{
		super(title);
		setLayout(fl);
		add(tired);
		
	}

}

