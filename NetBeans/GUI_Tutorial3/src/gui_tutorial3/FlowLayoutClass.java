package gui_tutorial3;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutClass extends JPanel {

    public FlowLayoutClass() {
        setLayout(new FlowLayout());
        for (int i = 1; i <= 5; i++) {
            add(new JButton("Button " + (Math.pow(10, i))));

        }

    }

}
