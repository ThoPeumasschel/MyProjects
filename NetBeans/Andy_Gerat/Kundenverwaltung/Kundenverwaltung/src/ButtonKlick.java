import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ButtonKlick implements ActionListener{
	Window w;
	ArrayList<Kunden> kundenListe;
	
	public ButtonKlick(Window w){
		this.w = w;
		kundenListe = new ArrayList<Kunden>();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//this.w.taAusgabe.setText( this.w.cbAnrede.getSelectedItem() + " " + this.w.tfNachname.getText() );
		
		if(e.getSource().equals( w.btnSpeichern ) ){
			kundenListe.add( new Kunden(
								w.cbAnrede.getSelectedItem() + "",
								w.tfNachname.getText(),
								w.tfVorname.getText(),
								w.tfStrasse.getText(),
								w.tfPlz.getText(),
								w.tfOrt.getText(),
								w.tfTelefon.getText(),
								w.tfIban.getText(),
								w.tfBic.getText()
							) );
			
			JOptionPane.showMessageDialog(null, "Kunde erfolgreich angelegt");
			clearWindow();
			w.tfNachname.requestFocus();
			
		}else if(e.getSource().equals( w.btnAnzeigen )){
			w.taAusgabe.setText("");
			
			for(Kunden kunde : kundenListe){
				w.taAusgabe.setText( w.taAusgabe.getText() + kunde.getAnrede() + " " + kunde.getNachname() + " " + kunde.getVorname() + "\n" );
			}
			
		}else if(e.getSource().equals(w.btnIbanCheck)){
			String iban = w.tfIban.getText().replace(" ", "");
			// IBAN auf Gültigkeit prüfen
			
			int i1 = iban.charAt(0) - 55;
			int i2 = iban.charAt(1) - 55;
			
			iban = iban.substring(4) + i1 + i2 + iban.substring(2, 4);
			
			int irest = 0;
			for(int i = 0; i < iban.length(); i++){
				irest = (irest * 10 + Integer.parseInt( iban.charAt(i) + "" ) ) % 97;
			}
			
			if(irest == 1)
				w.tfIban.setBackground(Color.green);
			else
				w.tfIban.setBackground(Color.red);

		}
	}
	
	private void clearWindow(){
		w.cbAnrede.setSelectedIndex( 1 );
		w.tfNachname.setText("");
		w.tfVorname.setText("");
		w.tfStrasse.setText("");
		w.tfPlz.setText("");
		w.tfOrt.setText("");
		w.tfTelefon.setText("");
		w.tfIban.setText("");
		w.tfBic.setText("");
	}
	
}
