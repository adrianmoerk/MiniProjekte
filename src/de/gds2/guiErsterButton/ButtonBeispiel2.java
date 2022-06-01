package de.gds2.guiErsterButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBeispiel2 extends JFrame implements ActionListener {
    JButton bSchliessen;

    public ButtonBeispiel2(String titel) {
        super(titel);
        this.setLayout(new FlowLayout());
        bSchliessen = new JButton("Schliessen");
        bSchliessen.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
