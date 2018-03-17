import java.awt.*;

public class Hamlet extends Frame {
	FlowLayout fl = new FlowLayout();
	List hm = new List(5, true);
	
	Hamlet(String title) {
		super(title);
		setLayout(fl);
		hm.add("Hamlet");
		hm.add("Claudius");
		hm.add("Gertrude");
		hm.add("Polonius");
		hm.add("Horatio");
		hm.add("Laertes");
		hm.add("Ophelia");
		add(hm);
		
		
	}

}
