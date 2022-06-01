package de.gds2.car2runaway;

public class Adress {
    private String strasse;
    private String ort;
    private int plz;
    private int hausnummer;

    public Adress() {
    }

    public Adress(String strasse, String ort, int plz, int hausnummer) {
        this.strasse = strasse;
        this.ort = ort;
        this.plz = plz;
        this.hausnummer = hausnummer;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }
}
