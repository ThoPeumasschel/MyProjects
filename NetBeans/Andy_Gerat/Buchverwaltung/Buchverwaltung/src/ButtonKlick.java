import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonKlick implements ActionListener {
	Window w;
	ArrayList<Buch> buecherListe;
	
	public ButtonKlick(Window w){
		this.w = w;
		buecherListe = new ArrayList<>();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(w.buchAnlegenItem)){
			panelNotVisible();
			w.plAnlegen.setVisible(true);
			System.out.println("test");
		}else if(arg0.getSource().equals(w.buchAnzeigenItem)){
			panelNotVisible();
			w.plAnzeigen.setVisible(true);
		}else if(arg0.getSource().equals(w.buchSuchenItem)){
			panelNotVisible();
			w.plSuchen.setVisible(true);
		}else if(arg0.getSource().equals(w.hilfeAbout)){
			
		}else if(arg0.getSource().equals(w.btnSpeichern)){
			
		}
	}

	private void panelNotVisible(){
		w.plAnlegen.setVisible(false);
		w.plAnzeigen.setVisible(false);
		w.plSuchen.setVisible(false);
		w.plMain.setVisible(false);
	}
	
}
