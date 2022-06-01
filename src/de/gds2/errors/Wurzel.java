package de.gds2.errors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wurzel {
    public static void berechneWurzel(double x) {
        double erg;
        if (x < 0.0) {
            throw new ArithmeticException("Zahl < 0: Wurzel Nicht Möglich");
        }
        erg = Math.sqrt(x);
        System.out.println(erg);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        try {
            System.out.println("Zahl: ");
            x = sc.nextDouble();
            berechneWurzel(x);
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("ungültige eingabe: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
