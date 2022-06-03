package de.gds2.logging.schreiben.fahrschulaufgabe;

public class FahrschulFausformel {
    public static void main(String[] args) {
        Rechnen rechnen = new Rechnen(100);
        System.out.println("Reaktionsweg: " + rechnen.getReaktionsweg());
        System.out.println("Bremsweg: " + rechnen.getBremsweg());
        System.out.println("Anhalteweg: " + rechnen.getAnhalteweg());
    }
}
