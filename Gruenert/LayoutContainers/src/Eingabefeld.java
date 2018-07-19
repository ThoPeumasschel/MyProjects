import java.awt.*;

public class Eingabefeld extends Frame {
	GridLayout lm = new GridLayout(3, 2, 20, 20);
	Button a = new Button("OK");
	Label nameLabel = new Label("Name");
	TextField name = new TextField(25);
	Label passwordLabel = new Label("Password");
	TextField password = new TextField(25);
	
	
	
	
	Eingabefeld(String title) {
		super(title);
		setLayout(lm);
		
		add(nameLabel);
		add(name);
		add(passwordLabel);
		password.setEchoChar('*');
		add(password);
		add(a);
		
	}
	
}
