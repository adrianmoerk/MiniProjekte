package de.gds2.rabatte;

public class RechnungStart {
    public static void main(String[] args) {
        Rechnung rechnung1 = new Rechnung(20,0.29);
        System.out.println(rechnung1.bruttobetragBerechnen());
        RabattierteRechnung rechnung2 = new RabattierteRechnung(40,0.1,20);
    }
}
