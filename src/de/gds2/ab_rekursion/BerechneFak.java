package de.gds2.ab_rekursion;

import java.util.Scanner;

public class BerechneFak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fakultout = 0;
        System.out.println("Eingabe: ");
        int i = sc.nextInt();
        fakultout = berechneFakultaet(i);
        System.out.println("Wert: " + fakultout);
    }

    private static int berechneFakultaet(int i) {
        int ergebnis = 0;
        if (i <= 1) {
            ergebnis = 1;
        } else {
            ergebnis = i * berechneFakultaet(i - 1);
        }
        return ergebnis;
    }
}
