package gui_tutorial3;

import java.awt.*;
import javax.swing.*;

public class GridLayoutClass extends JPanel {
    
    public GridLayoutClass () {
         setLayout(new GridLayout(0,3));
         
         //Panels erstellen für das Gridlayout, jedes Panel soll eine andere Farbe haben
         JPanel panel1 = new JPanel();
         panel1.setBackground(Color.yellow);
         JPanel panel2 = new JPanel();
         panel2.setBackground(Color.magenta);
         JPanel panel3 = new JPanel();
         panel3.setBackground(Color.black);
         JPanel panel4 = new JPanel();
         panel4.setBackground(Color.GREEN);
         JPanel panel5 = new JPanel();
         panel5.setBackground(Color.blue);
         JPanel panel6 = new JPanel();
         panel6.setBackground(Color.red);
         JPanel panel7 = new JPanel();
         panel7.setBackground(Color.orange);
         JPanel panel8 = new JPanel();
         panel8.setBackground(Color.CYAN);
         JPanel panel9 = new JPanel();
         panel9.setBackground(Color.PINK);
         
         add(panel1);
         add(panel2);
         add(panel3);
         add(panel4);
         add(panel5);
         add(panel6);
         add(panel7);
         add(panel8);
         add(panel9);
         
        
     
         
         
         //Jedem Panel einen Button zuweisen
         panel1.add(new JButton("1"));
         panel2.add(new JButton("2"));
         panel3.add(new JButton("3"));
         panel4.add(new JButton("4"));
         panel5.add(new JButton("5"));
         panel6.add(new JButton("6"));
         panel7.add(new JButton("7"));
         panel8.add(new JButton("8"));
         panel9.add(new JButton("9"));
         
         
         /*for(int i = 9; i >= 1; i--) {
             add(new JButton(new Integer(i).toString()));
         }
         */
         
         
         
    }
    
    public GridLayoutClass(int i){
        
        
    }
   
}
