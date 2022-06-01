package de.gds2.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaAusdruck {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LambdaAusdruck");
        frame.setContentPane(new LambdaAusdruck().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }

    private JButton lambdaAusloeserButton;
    private JPanel panel1;

    public LambdaAusdruck() {
        lambdaAusloeserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
