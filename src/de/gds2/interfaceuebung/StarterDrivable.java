package de.gds2.interfaceuebung;

public class StarterDrivable {
    public static void main(String[] args) {
        LKW lkw1 = new LKW();
        lkw1.beschleunigen(20);
        System.out.println(lkw1.tempo);
    }
}
