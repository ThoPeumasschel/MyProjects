package javaapplication6;

import java.awt.event.*;

public class Listener implements ActionListener {

    Fenster f;

    public Listener(Fenster fenster) {
        f = fenster;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(f.cbxBankdaten)) {
            panelBankdatenVisibility();
        } else if (ae.getSource().equals(f.btnSpeichern)) {
            speichern();
        }
    }

    private void panelBankdatenVisibility() {
        if (f.cbxBankdaten.isSelected()) {
            f.plBankdaten.setVisible(true);
        } else {
            f.plBankdaten.setVerifyInputWhenFocusTarget(false);
        }
    }

    private void speichern() {
        System.out.println(f.cbAnrede.getSelectedItem());

        String verhaeltnis = "";
        if (f.rb1.isSelected()) {
            verhaeltnis = f.rb1.getText();
        } else if (f.rb2.isSelected()) {
            verhaeltnis = f.rb2.getText();
        } else if (f.rb3.isSelected()) {
            verhaeltnis = f.rb3.getText();
        }

        System.out.println(verhaeltnis);
    }

}
