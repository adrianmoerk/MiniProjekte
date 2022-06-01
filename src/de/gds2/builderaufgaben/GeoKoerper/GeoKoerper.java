package de.gds2.builderaufgaben.GeoKoerper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class GeoKoerper {
    public GeoKoerper() {
        kugelberechnungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kugelberechnung();
            }
        });
        kreiszylinderberechnungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kreiszylinderberechnung();
            }
        });
        kreiskegelberechnungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kreiskegelberechnung();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GeoKoerper");
        frame.setContentPane(new GeoKoerper().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JPanel Kugel;
    private JPanel Kreiszylinder;
    private JTextField radius;
    private JTextField volumen;
    private JTextField oberflaeche;
    private JButton kugelberechnungButton;
    private JTextField radiusR;
    private JTextField volumenR;
    private JTextField oberflaecheR;
    private JTextField mantelflaecheR;
    private JButton kreiszylinderberechnungButton;
    private JPanel Kreiskegel;
    private JTextField radiusKk;
    private JTextField Hoehekk;
    private JTextField volumenkk;
    private JTextField oberflaechekk;
    private JTextField mantelflaechekk;
    private JTextField HoeheKz;
    private JButton kreiskegelberechnungButton;
    private JTabbedPane tabbedPane1;

    public void kugelberechnung() {
        DecimalFormat df = new DecimalFormat("#0.00");
        double r = Double.parseDouble(this.radius.getText());
        Kugel k = new Kugel(r);
        volumen.setText(df.format(k.getVolumen()));
        oberflaeche.setText(df.format(k.getOberflaeche()));
    }

    //Kreiszylinder
    public void kreiszylinderberechnung() {
        DecimalFormat df = new DecimalFormat("#0.00");
        double r = Double.parseDouble(this.radiusR.getText());
        double h = Double.parseDouble(this.HoeheKz.getText());
        Kreiszylinder k = new Kreiszylinder(r, h);
        volumenR.setText(df.format(k.getVolumen()));
        oberflaecheR.setText(df.format(k.getOberflaeche()));
        mantelflaecheR.setText(df.format(k.getMantelflaeche()));
    }

    //Kreiskegel
    public void kreiskegelberechnung() {
        DecimalFormat df = new DecimalFormat("#0.00");
        double r = Double.parseDouble(this.radiusKk.getText());
        double h = Double.parseDouble(this.Hoehekk.getText());
        Kreiskegel k = new Kreiskegel(r, h);
        volumenkk.setText(df.format(k.getVolumen()));
        oberflaechekk.setText(df.format(k.getOberflaeche()));
        mantelflaechekk.setText(df.format(k.getMantelflaeche()));
    }
}
