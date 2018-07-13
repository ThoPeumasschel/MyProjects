import java.awt.*;

public class Virginia extends Frame {
	FlowLayout fl = new FlowLayout();
	String letter = "Dear editor:\nI am 8 years old.\nVirginia O'Hanlon\n115 West 95th Street\nNew York";
	TextArea lt = new TextArea(letter, 10, 50);

	Virginia(String title) {
		super(title);
		setLayout(fl);
		add(lt);

	}

}
