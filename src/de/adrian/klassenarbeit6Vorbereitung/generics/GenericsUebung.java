package de.adrian.klassenarbeit6Vorbereitung.generics;

public class GenericsUebung<Fortnite> {
    private Fortnite fortnite;

    public GenericsUebung(Fortnite fortnite) {
        this.fortnite = fortnite;
    }

    public Fortnite getFortnite() {
        return fortnite;
    }

    public void setFortnite(Fortnite fortnite) {
        this.fortnite = fortnite;
    }
}
