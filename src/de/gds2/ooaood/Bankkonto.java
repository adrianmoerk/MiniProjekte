package de.gds2.ooaood;

public abstract class Bankkonto {
    protected double kontoStand;

    public Bankkonto(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public void einzahlen(double x) {
        this.kontoStand = this.kontoStand + x;
    }

    public void abheben(double x) {
        this.kontoStand = this.kontoStand - x;
    }
}
