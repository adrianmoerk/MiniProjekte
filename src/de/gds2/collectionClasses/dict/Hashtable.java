package de.gds2.collectionClasses.dict;

public class Hashtable {
    public static void main(String[] args) {
        java.util.Hashtable<Integer, String> h = new java.util.Hashtable<>();
        h.put(3, "Klaus");
        h.put(2, "Laus");
        h.put(1, "Hassib");
        System.out.println(h.get(3));

    }
}
