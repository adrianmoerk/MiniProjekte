package de.gds2.aufgabenblatt1;

import java.util.Random;

public class Aufgabe1 {
    public static void main(String[] args) {
        String str1 = "NIFOINAK vboÖB F BUFÖABJ UIBW CjbC";
        LeerzeichenEntfernenAusString(str1);
        TextOhneVokale(str1);
        Reverse(str1);
        ErzeugeZufaelligesPasswort(7);

    }

    public static void LeerzeichenEntfernenAusString(String str) {
        System.out.println(str.replace(" ", ""));
    }

    public static void TextOhneVokale(String str) {
        System.out.println(str.replaceAll("[aeiouAEIOUöäüÖÄÜ]", ""));
    }

    public static void Reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }

    public static void ErzeugeZufaelligesPasswort(int passwortlaenge) {
        String passwort = "";
        if (passwortlaenge > 5) {
            for (int i = 0; i < passwortlaenge; i++) {
                Random rnd = new Random();
                int rndzahl = rnd.nextInt(80);
                passwort += (char) rndzahl;
            }
            System.out.println("passwort: " + passwort);

        } else {
            System.out.println("Passwort muss mehr als 5 Zeichen sein");
        }

    }
}
