package de.adrian.klassenarbeit6Vorbereitung.generics;

public class GenericStart {
    public static void main(String[] args) {
        GenericsUebung<Integer> genericsUebung = new GenericsUebung<>(1);
        System.out.println(genericsUebung.getFortnite());
        GenericsUebung<String> hassib = new GenericsUebung<>("HASI");
        System.out.println(hassib.getFortnite());
        JoeGeneric<Double> joe = new JoeGeneric<>(1.0);
        System.out.println(joe.getMama());
        Swag<Integer> testo = new Swag<>(5);
        System.out.println(testo.getSupi());
    }
}
