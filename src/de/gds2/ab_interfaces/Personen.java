package de.gds2.ab_interfaces;

public class Personen implements NachrichtenEmpfaenger {
    private String vorname;
    private String nachname;

    public Personen(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public void empfangeNachricht(String nachricht) {

    }
}
