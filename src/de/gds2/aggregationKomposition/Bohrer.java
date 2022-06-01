package de.gds2.aggregationKomposition;

public class Bohrer extends Werkzeug {
    private int groesse;

    public Bohrer(String art, int verschleiss, int groesse) {
        super(art, verschleiss);
        this.groesse = groesse;
    }

    @Override
    public void ausgeben() {
        System.out.println("Groesse: " + this.groesse + "\nVerschleiss: " + this.verschleiss + "\nArt: " + this.art);
    }
}
