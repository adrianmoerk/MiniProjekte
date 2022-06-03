package de.gds2.waehrungsRechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
    JButton umrechnen;
    JTextField waehrung1, waehrung2;
    JLabel lwaehrung1, lwaehrung2;

    public Gui() {
        super("Waehrungsrechner");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(5, 1));

        waehrung1 = new JTextField();
        waehrung2 = new JTextField();
        lwaehrung1 = new JLabel("In");
        lwaehrung2 = new JLabel("Out");
        this.add(lwaehrung1);
        this.add(waehrung1);
        this.add(lwaehrung2);
        this.add(waehrung2);
        waehrung1.setText("0");
        waehrung2.setText("0");
        umrechnen = new JButton("Umrechnen");
        this.add(umrechnen);
        umrechnen.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == umrechnen) {
            String w1 = waehrung1.getText();
            // Get last three characters of string
            String waehrung = w1.substring(w1.length() - 3);
            String value = w1.substring(0, w1.length() - 3);

            double euro = Double.parseDouble(value);
            String result = Umrechner.umrechnen(euro, waehrung);
            waehrung2.setText(result);
        }

    }
}

