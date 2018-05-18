import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame implements ActionListener{
	
	private int runde = 0;
	private JButton[] buttonListe = new JButton[9];
	
	int X_speicher;
    int O_speicher;
    int[] gewinnzahlen = {7, 56, 448, 73, 146, 292, 273, 85};
    //  1   2   4 // alle Gewinnkombinationen zusammen addieren und im Array hinterlegen
    //  8  16  32
    // 64 128 256
    
	public Window(){
		super("Tic Tac Toe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setLayout(null);
		
		int x = 100, y = 100;

		for(int i = 1; i <= 9; i++){
			JButton btn = new JButton("" + i);
			btn.setBounds(x, y, 50, 50);
			btn.addActionListener(this);
			add(btn);
			buttonListe[i-1] = btn;
			
			x += 55;
			if(i % 3 == 0){

				x = 100;
				y += 55;
			}
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Window();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		runde++;
		//System.out.println( ((JButton)arg0.getSource()).getText() );
		int buttonText = Integer.parseInt(((JButton)arg0.getSource()).getText());
		if(runde % 2 == 0){
			((JButton)arg0.getSource()).setText("O");
			O_speicher += 1 << (buttonText - 1); // merken auf welchem Button ein O
		}else{
			((JButton)arg0.getSource()).setText("X");
			X_speicher += 1 << (buttonText - 1); // merken auf welchem Button ein X
		}
		
		// Gewinn prüfen
		boolean gewonnen = false;
		if(runde >= 5){
			for (int i = 0; i < 8; i++) {
                if ((X_speicher & gewinnzahlen[i]) == gewinnzahlen[i] || (O_speicher & gewinnzahlen[i]) == gewinnzahlen[i]){
                	if(runde % 2 == 0)
        				System.out.println("Gewonnen - Player O");
        			else
        				System.out.println("Gewonnen - Player X");
                }
            }
			
		}
		
	}

}
