package de.gds2.kaffeemaschiene;

import java.util.Scanner;

public class KaffeeStart {
    public static void main(String[] args) {
        Rezept maschine1 = new Rezept();
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (maschine1.kaffee.getAktuellerFuellstand() <= 0.2 || maschine1.wasser.getAktuellerFuellstand() <= 0.2 || maschine1.milch.getAktuellerFuellstand() <= 0.2 || maschine1.kakao.getAktuellerFuellstand() <= 0.2 || maschine1.zucker.getAktuellerFuellstand() <= 0.2) {
                System.out.println("Eine zutat ist leer");
                break;
            }
            int auswahl = 0;
            System.out.println("Getraenk Wählen:\n 1: Kaffee Schwarz \n 2: Kaffee Zucker \n 3: Kaffee Milch \n 4: Kaffee Milch + Zucker\n 5: Kakao \n 6: Füllstand Überprüfen");
            auswahl = sc.nextInt();
            switch (auswahl) {
                case 1:
                    maschine1.kaffeeSchwarz();
                    break;
                case 2:
                    maschine1.kaffeeZucker();
                    break;
                case 3:
                    maschine1.kaffeeMilch();
                    break;
                case 4:
                    maschine1.kaffeeMilchZucker();
                    break;
                case 5:
                    maschine1.kakaomachen();
                    break;
                case 6:
                    maschine1.toString();
                    break;
            }
        }
    }
}
