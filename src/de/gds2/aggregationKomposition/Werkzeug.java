package de.gds2.aggregationKomposition;

public abstract class Werkzeug {
    protected String art;
    protected int verschleiss = 0;

    public Werkzeug(String art, int verschleiss) {
        this.art = art;
        this.verschleiss = verschleiss;

    }

    public abstract void ausgeben();
}
