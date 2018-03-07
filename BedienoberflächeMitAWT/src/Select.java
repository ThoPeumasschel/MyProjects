import java.awt.*;

public class Select extends Frame {
	FlowLayout fl = new FlowLayout();
	Choice span = new Choice();

	Select(String title) {
		super(title);
		setLayout(fl);
		span.addItem("Pedro");
		span.addItem("Antonio");
		span.addItem("Charo");
		span.addItem("Xavier");
		span.addItem("Julio");
		add(span);
	}

}
