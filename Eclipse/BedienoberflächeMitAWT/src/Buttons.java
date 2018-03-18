
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Buttons extends Frame {
	FlowLayout fl = new FlowLayout();
	
	Button rewind = new Button("Rewind");
	Button play = new Button("Play");
	Button ff = new Button("Fast Forward");
	Button stop = new Button("Stop");
	Button eat = new Button("Eat Tape");
	
	
	Buttons(String title) 
	{
		super(title);
		setLayout(fl);
		add(rewind);
		add(play);
		add(ff);
		add(stop);
		add(eat);
		
	}
}