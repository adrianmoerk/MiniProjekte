package de.gds2.errors.ausnahmebehandlung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMIException {
    public static void main(String[] args) {
        double gewicht, groesse;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Gewicht: ");
            sc.nextDouble();
            System.out.print("Grösse: ");
            sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Ungültige eingabe: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ungültige eingabe: " + e.getMessage());
        }

    }

    public static void berechneBMI(double gewicht, double groesse) {
    }
}
