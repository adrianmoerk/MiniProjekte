package de.gds2.alkohol;

public enum Alkohol {
    WEIN(12), BIER(4.8), WASSER(0), TSCHAY(0), KORN(32), WHISKEY(43);

    private final double alkoholgehalt;

    Alkohol(double alkoholgehalt) {
        this.alkoholgehalt = alkoholgehalt;
    }

    public double alkoholgehalt() {
        return alkoholgehalt;
    }

    //Gemeinsame Methode soll die Abbauzeit des Alkohols berechnen

    public String abbauzeit(double koerpergewicht, double getraenkeMenge) {
        double mengeAlkohol = getraenkeMenge * alkoholgehalt / 100;
        //0,11g Alkohol abbau pro Kilo Koerpergewicht und Stunde
        double abbauZeit = 9090.9 * mengeAlkohol / koerpergewicht;
        return "Alkoholabbau dauert: " + abbauZeit + "h bei " + getraenkeMenge + " Liter " + toString() + " bei: " + koerpergewicht + "kg Koerpergewicht";
    }
}
