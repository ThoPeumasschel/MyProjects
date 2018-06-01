package gui_tutorial3;

import java.awt.*;
import javax.swing.*;

public class GUI_Tutorial3 {

    public static void main(String[] args) {

        JFrame jfr = new JFrame("TPDevelop");
        jfr.setDefaultCloseOperation(jfr.EXIT_ON_CLOSE);
        jfr.setSize(300, 300);
        //jfr.add(new FlowLayoutClass());
        //jfr.add(new BorderLayoutClass());
        //jfr.add(new GridLayoutClass());
        jfr.add(new BoxLayoutClass());
        
        //jfr.pack();
        jfr.setVisible(true);
    }

}
