package de.gds2.rabatte;

public class RabattierteRechnung extends Rechnung{
    private double rabatt;
    RabattierteRechnung(double gesamtbetrag, double mehrwertsteuer, double rabatt){
        super(gesamtbetrag, mehrwertsteuer);
        this.rabatt = rabatt;
    }
}
