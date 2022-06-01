package de.gds2.lambda.lambdaAusdruck;

import javax.swing.*;

public class LambdaAusdruck extends JFrame implements Drucker {
    JButton lambdaAusloeserButton;

    LambdaAusdruck() {
        super("LambdaAusdruck");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        lambdaAusloeserButton = new JButton("Lambda Auslöser");
        this.add(lambdaAusloeserButton);
        setVisible(true);
    }

    @Override
    public void ausdrucken(String s, String t) {
        System.out.println(s + " " + t);
    }
}
