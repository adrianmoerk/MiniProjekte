package de.gds2.schulverwaltungsSoftware;

public class Schueler extends Mensch {
    private int klassenstufe;

    Schueler(String name, int alter, int klassenstufe) {
        super(name, alter);
        this.klassenstufe = klassenstufe;
    }

    public double jahresbeitrag() {
        double jahresbeitrag;
        jahresbeitrag = (double)this.alter / (double)this.klassenstufe * 5;
        return jahresbeitrag;
    }
}
