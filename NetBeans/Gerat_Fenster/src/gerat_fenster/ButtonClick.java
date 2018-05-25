package gerat_fenster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonClick implements ActionListener {

    Window w;
    
    ButtonClick(Window window) {
        w = window;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double euro = Double.parseDouble(w.tfEuro.getText().replace(",", "."));
        double dollar = euro * 1.17;
        w.lblAusgabe.setText(("US$ " + dollar).replace(".", ",") );
        
    }
    
    
    
    
    
    
}
