package de.gds2.ooaood;

public class KontoStart {
    public static void main(String[] args) {
        Girokonto gk = new Girokonto(1000, 5);
        gk.abheben(15);
        System.out.println(gk.getKontoStand());
    }
}
