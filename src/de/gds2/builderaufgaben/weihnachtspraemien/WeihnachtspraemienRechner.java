package de.gds2.builderaufgaben.weihnachtspraemien;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeihnachtspraemienRechner {
    public WeihnachtspraemienRechner() {
        berechnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean alterUeber50 = groesserGleich50Jahre.isSelected();
                double dA = Double.parseDouble(dienstAlter.getText());
                Praemie praem = new Praemie(alterUeber50, dA);
                praemie.setText(String.valueOf(praem.getBonus()));
            }
        });
        beendenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("WeihnachtspraemienRechner");
        frame.setContentPane(new WeihnachtspraemienRechner().Weihnachtspraemienrechner);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel links;
    private JPanel rechts;
    private JTextField dienstAlter;
    private JTextField praemie;
    private JRadioButton kleinerGleich50Jahre;
    private JRadioButton groesserGleich50Jahre;
    private JButton berechnenButton;
    private JButton beendenButton;
    private JPanel Weihnachtspraemienrechner;
}
