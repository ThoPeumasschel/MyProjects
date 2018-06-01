/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_tutorial3;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author tpeuschel
 */
public class BorderLayoutClass extends JPanel {

    public BorderLayoutClass() {
        setLayout(new BorderLayout(10, 10));
        add(new JButton("Norden"), BorderLayout.NORTH);
        add(new JButton("Westen"), BorderLayout.WEST);
        add(new JButton("Osten"), BorderLayout.EAST);
        add(new JButton("Süden"), BorderLayout.SOUTH);
        add(new JButton("Mitte"), BorderLayout.CENTER);
        
        
        
    }

    

}
