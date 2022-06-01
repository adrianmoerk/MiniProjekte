package de.gds2.kaffeemaschiene;

public abstract class Behaelter {
    private double aktuellerFuellstand;
    private double maxFuellstand;

    public Behaelter(double aktuellerFuellstand, double maxFuellstand) {
        this.aktuellerFuellstand = aktuellerFuellstand;
        this.maxFuellstand = maxFuellstand;
    }

    public abstract String toString();

    public double getAktuellerFuellstand() {
        return aktuellerFuellstand;
    }

    public void setAktuellerFuellstand(double aktuellerFuellstand) {
        this.aktuellerFuellstand = aktuellerFuellstand;
    }

    public double getMaxFuellstand() {
        return maxFuellstand;
    }

    public void setMaxFuellstand(double maxFuellstand) {
        this.maxFuellstand = maxFuellstand;
    }
}
