package de.gds2.ab_rekursion.Telefonalarm;

public class Spieler {
    private String name;
    private String vorname;
    private int telefonnummer;

    public Spieler(String name, String vorname, int telefonnummer) {
        this.name = name;
        this.vorname = vorname;
        this.telefonnummer = telefonnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
}
