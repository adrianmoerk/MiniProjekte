package de.gds2.projektImmobilie;

public class Wohnung {
    private String ort;
    private int baujahr;
    private double wohnflaeche;
    private double preis;

    public Wohnung(String ort, int baujahr, double wohnflaeche, double preis) {
        this.ort = ort;
        this.baujahr = baujahr;
        this.wohnflaeche = wohnflaeche;
        this.preis = preis;
        System.out.println(this.ort + "\n" + this.baujahr + "\n" + this.wohnflaeche + "\n" + this.preis + "\n");
    }

    public String getOrt() {
        return ort;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public double getWohnflaeche() {
        return wohnflaeche;
    }

    public double getPreis() {
        return preis;
    }

    public void setWohnflaeche(double wohnflaeche) {
        this.wohnflaeche = wohnflaeche;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
