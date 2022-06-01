package de.adrian.turbovir;

import javax.swing.*;
import java.util.Random;

public class Turbovir extends JFrame {
    JPanel panel;
    JButton button;
    JLabel label;
    JTextField textField;

    public Turbovir() {
        super("Turbovir");
        // random number generator between 1 and 1920
        Random rand = new Random();
        int width = rand.nextInt(1920) + 1;
        int height = rand.nextInt(1080) + 1;

        Random random = new Random();
        setBounds(width, height, width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        button = new JButton("Click me");
        label = new JLabel("Enter your name");
        textField = new JTextField(20);
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        add(panel);
    }

}
