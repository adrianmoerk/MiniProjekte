package de.gds2.kaffeemaschiene;

public class ZutatenBehaelter extends Behaelter {
    private String zutat;

    public ZutatenBehaelter(double aktuellerFuellstand, double maxFuellstand, String zutat) {
        super(aktuellerFuellstand, maxFuellstand);
        this.zutat = zutat;
    }

    public void zutatEntnehmen(double entnahmeMenge) {
        this.setAktuellerFuellstand(this.getAktuellerFuellstand() - entnahmeMenge);
    }

    public void zutatAuffuellen() {
        this.setAktuellerFuellstand(this.getMaxFuellstand());
    }

    @Override
    public String toString() {
        return zutat + ":\t" + this.getAktuellerFuellstand() + "/" + this.getMaxFuellstand();
    }
}
