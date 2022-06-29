package de.gds2.collectionClasses.hashmap.kfz;

public class Starter {
    public static void main(String[] args) {
        KFZMapping kennzeichen = new KFZMapping();
        kennzeichen.insert("S", "Stuttgart");
        kennzeichen.insert("BB", "Böblingen");
        kennzeichen.insert("B", "Berlin");
        kennzeichen.print("S");
        kennzeichen.print("BB");
        kennzeichen.print("B");
        kennzeichen.remove("B");
    }
}
