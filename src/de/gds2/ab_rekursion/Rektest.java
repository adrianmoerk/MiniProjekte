package de.gds2.ab_rekursion;

import java.util.Scanner;

public class Rektest {
    public static void main(String[] args) {
        // Methode lieszeichen

        System.out.println("Geben sie eine Zeile ein, solange die Zeile nicht mit _ anfängt geht es weiter ");
        lieszeichen();

        System.out.println("Ende der Rekursion");
    }

    private static void lieszeichen() {
        Scanner sc = new Scanner(System.in);
        char z = sc.nextLine().charAt(0);
        if (z != '_') {
            lieszeichen();
        }
        System.out.println(z);
        sc.close();
    }
}