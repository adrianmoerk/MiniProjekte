package de.gds2.car2runaway;

public class Fuhrpark {
    private static int gesamtzahlfahrzeuge;
    private int fahrzeugcounter;
    private Auto[] fahrzeuge;

    //Grunddaten
    private String name;
    private Adress adresse;

    //Konstruktor

    public Fuhrpark() {
    }

    public Fuhrpark(String name, Adress adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public Fuhrpark(String name) {
        this.name = name;
        //Adress myAdress = new Adress();
        this.adresse = new Adress();
    }
    public Auto[] addFahrzeug(Auto auto){
        

        return fahrzeuge;
    }
}
