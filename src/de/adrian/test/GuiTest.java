package de.adrian.test;

import javax.swing.*;
import java.awt.*;

public class GuiTest {
    //gui mit zwei knöpfen die ok und "exit" heißen, "exit" beendet das programm

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setVisible(true);
        JButton ok = new JButton("ok");
        JButton exit = new JButton("exit");
        //make ok blue
        ok.setBackground(Color.BLUE);
        //make exit red
        exit.setBackground(Color.RED);
        frame.add(ok);
        frame.add(exit);
    }

}