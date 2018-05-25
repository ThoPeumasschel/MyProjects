package gerat_fenster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame {
    
    // Formularelemente deklarieren
    JLabel lblEuro;
    JTextField tfEuro;
    JButton btnBerechnen;
    JLabel lblAusgabe;

    public Window() {
        super("Schöne GUI");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(600, 400);
        
        // Formularelemente initialisieren
        lblEuro = new JLabel("Euro"); // kann auch HTML und CSS aufnehmen!! Bei Label und Button möglich.
        tfEuro = new JTextField();
        btnBerechnen = new JButton("berechnen");
        lblAusgabe = new JLabel("Ausgabe");
        
        // Formularelemente positionieren und Größe festlegen
        lblEuro.setBounds(50, 50, 100, 25);
        tfEuro.setBounds(50, 80, 100, 25);
        btnBerechnen.setBounds(50, 110, 100, 25);
        lblAusgabe.setBounds(50, 140, 100, 25);
        
        // Formularelemente dem Window hinzufügen
        this.add(lblEuro);
        this.add(tfEuro);
        add(btnBerechnen);
        add(lblAusgabe);
        
        /*
        btnBerechnen.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("test");
           
            }
        });
        */
        
        btnBerechnen.addActionListener(new ButtonClick());
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();

    }

}
