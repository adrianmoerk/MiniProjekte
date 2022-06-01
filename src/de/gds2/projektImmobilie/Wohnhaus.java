package de.gds2.projektImmobilie;

public class Wohnhaus extends Wohnung {
    private double grundstuecksflaeche;

    public Wohnhaus(String ort, int baujahr, double wohnflaeche, double preis, double grundstuecksflaeche) {
        super(ort, baujahr, wohnflaeche, preis);
        this.grundstuecksflaeche = grundstuecksflaeche;
        System.out.println(this.grundstuecksflaeche + "\n");
    }
}
