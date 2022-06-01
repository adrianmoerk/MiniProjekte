package de.gds2.alkohol;

public class AlkoholTest {
    public static void main(String[] args) {
        System.out.println("Der Alkoholgehalt von Bier: " + Alkohol.BIER.alkoholgehalt() + " Volumen %");
        System.out.println(Alkohol.WHISKEY.abbauzeit(75, 1));
    }
}