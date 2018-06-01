package gui_tutorial3;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutClass extends JPanel {

    public BoxLayoutClass() {
        this(BoxLayout.Y_AXIS);
    }

    public BoxLayoutClass(int ausrichtung) {
        setLayout(new BoxLayout(this, ausrichtung));
        for (int i = 1; i <= 5; i++) {
            add(new JButton(new Integer(i).toString()));
        }

    }

}
