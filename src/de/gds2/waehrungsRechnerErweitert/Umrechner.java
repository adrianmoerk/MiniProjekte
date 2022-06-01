package de.gds2.waehrungsRechnerErweitert;

import java.text.DecimalFormat;

public class Umrechner {
    public static String umrechnen(double betrag, String inputWaehrung) {
        double result = 0;
        String outputWaehrung = "€";
        DecimalFormat df = new DecimalFormat("#0.00");
        switch (inputWaehrung) {
            case "EUR":
                result = betrag * 0.86;
                outputWaehrung = "$";
                break;
            case "USD":
                result = betrag * 1.14;
                outputWaehrung = "€";
                break;
            case "CHF":
                result = betrag * 1.09;
                outputWaehrung = "€";
                break;
            case "GBP":
                result = betrag * 0.78;
                outputWaehrung = "€";
                break;
        }
        return df.format(result) + " " + outputWaehrung;
    }
}
