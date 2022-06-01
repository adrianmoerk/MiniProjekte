package de.gds2.uhrGui;

import javax.swing.*;
import java.util.Date;

public class GuiUhr {
    public static void main(String[] args) {
        GuiUhr uhr = new GuiUhr();

        for (int i = 1; i > 0; i--) {
            uhr.Fenster(i + 1, i + 1);
        }
    }

    public void Fenster(int x, int y) {
        JFrame fenster = new JFrame("GOMMEHD");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setBounds(x + 50, y + 50, 400, 400);
        JLabel label = new JLabel("<HTML><H1>Die uhr die niemals Schlägt</H1></HTML>");
        //fenster.add(label);
        fenster.setVisible(true);

        while (true){
            JLabel uhrzeit = new JLabel(String.format("%tT",new Date()));
            fenster.remove(uhrzeit);
            fenster.add(uhrzeit);
        }
    }
}
