package de.gds2.schulverwaltungsSoftware;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Alter: ");
        int alter = sc.nextInt();
        System.out.print("Klassenstufe: ");
        int klassenstufe = sc.nextInt();
        Schueler schueler1 = new Schueler(name, alter, klassenstufe);
        System.out.println(schueler1.jahresbeitrag());
    }
}
