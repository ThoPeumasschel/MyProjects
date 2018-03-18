import java.awt.*;

public class OutOfSite extends Frame {
	FlowLayout fl = new FlowLayout();		//An dieser Stelle wäre das GridLayout besser. Wird aber erst später erklärt. 
	Label siteLabel = new Label("Site Name: ");
	TextField site = new TextField(25);
	Label addressLabel = new Label("Site Address: ");
	TextField address = new TextField(25);
	Label passwordLabel = new Label("Admin Password: ");
	TextField password = new TextField(25);
	

	OutOfSite(String title) {
		super(title);
		setLayout(fl);
		add(siteLabel);
		add(site);
		add(addressLabel);
		add(address);
		add(passwordLabel);
		password.setEchoChar('*');
		add(password);

	}

}
