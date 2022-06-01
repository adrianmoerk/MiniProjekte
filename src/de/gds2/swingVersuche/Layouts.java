package de.gds2.swingVersuche;

import javax.swing.*;
import java.awt.*;

public class Layouts extends JFrame {
    //constructor with title and LayoutType
    public Layouts(String title) throws HeadlessException {
        super(title);
        JLabel lb;
        this.setBounds(500, 250, 500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout());
        lb = new JLabel("Hello ADV World");
        this.add(lb);
    }
}
