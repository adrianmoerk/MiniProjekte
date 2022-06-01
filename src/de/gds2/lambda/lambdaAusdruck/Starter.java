package de.gds2.lambda.lambdaAusdruck;

public class Starter {
    public static void main(String[] args) {
        LambdaAusdruck la = new LambdaAusdruck();
        Drucker p = (s, t) -> {
            t = t.toUpperCase();
            System.out.println(s + " " + t);
        };
        la.lambdaAusloeserButton.addActionListener(e -> p.ausdrucken("Hallo", "Welt"));
    }
}

