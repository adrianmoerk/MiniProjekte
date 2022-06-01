package de.gds2.waehrungsRechner;

import java.text.DecimalFormat;

public class Umrechner {
    public static String umrechnen(double betrag, String inputWaehrung) {
        double result = 0;
        String outputWaehrung = "€";
        DecimalFormat df = new DecimalFormat("#0.00");
        if (inputWaehrung.equals("EUR")) {
            result = betrag * 1.12;
            outputWaehrung = "$";
        } else if (inputWaehrung.equals("USD")) {
            result = betrag * 0.82;
        } else if (inputWaehrung.equals("YEN")) {
            result = betrag * 0.0073;
        } else if (inputWaehrung.equals("GBP")) {
            result = betrag * 1.17;
        }

        return df.format(result) + " " + outputWaehrung;
    }
}
