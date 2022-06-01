package de.gds2.swingVersuche;

import javax.swing.*;
import java.awt.*;

public class AdriFrame extends JFrame {
    public AdriFrame(String title) {
        super(title);
        JLabel lb;
        this.setBounds(500, 250, 500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        lb = new JLabel("Hello ADV World");
        this.add(lb);
    }
}
