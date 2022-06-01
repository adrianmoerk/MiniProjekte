package de.gds2.errors;

import java.util.Scanner;

public class Errortest {
    public static void main(String[] args) {
        int zaehler, nenner, division;
        Scanner sc = new Scanner(System.in);
        System.out.println("Division zweier int-Zahlen");
        System.out.println("********************");
        System.out.print("Bitte geben Sie den Zähler ein: ");
        zaehler = sc.nextInt();
        System.out.println("Bitte geben Sie den Nenner ein: ");
        nenner = sc.nextInt();
        try {
            division = zaehler / nenner;
            System.out.println("Ergebnis aus " + zaehler + " / " + nenner + " = " + division);
        } catch (Exception e) {
            System.out.println("Mindestausgaben: ");
            String name = e.getClass().getName();
            String msg = e.getMessage();
            String toSrt = e.toString();
            e.printStackTrace(); //Das mindeste
            System.out.println("Message: " + name + msg + toSrt);
        } finally {
            System.out.println("error du idiot");
        }
        sc.close();
    }
}
