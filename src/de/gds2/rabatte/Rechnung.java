package de.gds2.rabatte;

public class Rechnung {
    protected double gesamtbetrag;
    protected double mehrwertsteuer;
    Rechnung(double gesamtbetrag, double mehrwertsteuer){
        this.gesamtbetrag = gesamtbetrag;
        this.mehrwertsteuer = mehrwertsteuer;
    }
    protected double bruttobetragBerechnen(){
        double bruttobetrag;
        bruttobetrag = this.gesamtbetrag + this.gesamtbetrag * this.mehrwertsteuer;
        return bruttobetrag;
    }
}
