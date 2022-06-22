package de.gds2.logging.schreiben.fahrschulaufgabe;

public class Rechnen {
    private double bremsweg;
    private double geschwindigkeit;
    private double reaktionsweg;
    private double anhalteweg;

    public Rechnen(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public double getReaktionsweg() {
        this.reaktionsweg = (this.geschwindigkeit / 10) * 3;
        return this.reaktionsweg;
    }

    public double getBremsweg() {
        this.bremsweg = (this.geschwindigkeit / 10) * (this.geschwindigkeit / 10);
        return this.bremsweg;
    }

    public double getAnhalteweg() {
        this.anhalteweg = getBremsweg() + getReaktionsweg();
        return this.anhalteweg;
    }
}
