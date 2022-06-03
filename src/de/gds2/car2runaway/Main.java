package de.gds2.car2runaway;

public class Main {
    public static void main(String[] args) {
        Auto audi = new Auto("Audi", "A5", 4, 100, true, true, "Elektro");
        Auto vw = new Auto("VW", "A5", 5, 120, true, true, "Diesel");


        //DoganLösung
        Adress adresseFuhrparkBoeblingen = new Adress("Joegehweg", "Boeblingen", 79032, 1);
        Fuhrpark fuhrparkBoeblingen = new Fuhrpark("Dogans Fuhrpark", adresseFuhrparkBoeblingen);
        //TrautweinLösung
        Fuhrpark fuhrparkKoeln = new Fuhrpark();
        //GadeLösung
        Fuhrpark fuhrparkGerlingen = new Fuhrpark("Gerllingen");
        //LutherLösung
        Fuhrpark adresseFuhrparkLuther = new Fuhrpark("Timons Fuhrpark", new Adress("Weg", "Boeblingen", 12345, 4));

    }
}
