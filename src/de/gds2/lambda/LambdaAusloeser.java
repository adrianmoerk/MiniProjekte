package de.gds2.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaAusloeser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LambdaAusloeser");
        frame.setContentPane(new LambdaAusloeser().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton lambdaAusloeserButton;
    private JPanel panel1;

    public LambdaAusloeser() {
        lambdaAusloeserButton.addActionListener(e -> {
            System.out.println("Lambda Ausloeser");
            System.exit(0);
        });
    }
}
