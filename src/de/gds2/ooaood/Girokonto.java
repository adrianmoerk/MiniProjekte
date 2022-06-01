package de.gds2.ooaood;

public class Girokonto extends Bankkonto {
    private double gebuhr;

    public Girokonto(double anfangsBetrag, double gebuhr) {
        super(anfangsBetrag);
        this.gebuhr = gebuhr;
    }

    @Override
    public void einzahlen(double x) {
        this.kontoStand = this.kontoStand + x;
    }

    @Override
    public void abheben(double x) {
        this.kontoStand = this.kontoStand - x - this.gebuhr;
    }
}
