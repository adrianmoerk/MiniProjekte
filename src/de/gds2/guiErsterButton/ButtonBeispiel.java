package de.gds2.guiErsterButton;

import javax.swing.*;
import java.awt.*;

public class ButtonBeispiel extends JFrame {
    JButton bSchliessen;

    public ButtonBeispiel(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        Icon icon = new ImageIcon(getClass().getResource("fortnite1.jpg"));
        bSchliessen = new JButton();
        bSchliessen.setIcon(icon);
        bSchliessen.addActionListener(e -> System.exit(0));
        this.add(bSchliessen);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
