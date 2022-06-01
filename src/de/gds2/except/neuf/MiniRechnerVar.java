package de.gds2.except.neuf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniRechnerVar {
    public static void main(String[] args) {
        try {
            //Deklaration
            double division;
            division = division();
            System.out.println("Ergebnis: " + division);

        } catch (InputMismatchException e) {
            System.out.println("Da hätten sie besser aufpassen sollen");

        } catch (ArithmeticException e) {
            System.out.println("Mindestausgaben: ");
            String name = e.getClass().getName();
            String msg = e.getMessage();
            String toStr = e.toString();
            System.out.println("Name: " + name);
            System.out.println("Message: " + msg);
            System.out.println("Error: " + toStr);

        } finally {
        }
    }

    public static double division() {
        Scanner sc = new Scanner(System.in);
        double zaehler, nenner;
        System.out.println("Division zweier Int- Zahlen");
        System.out.println("***************************");
        System.out.print("Zähler: ");
        zaehler = sc.nextInt();
        System.out.print("Nenner: ");
        nenner = sc.nextInt();
        double ergebnis = zaehler / nenner;
        sc.close();
        return ergebnis;
    }

}
