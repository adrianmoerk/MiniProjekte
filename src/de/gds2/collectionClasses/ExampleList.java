package de.gds2.collectionClasses;

import java.util.ArrayList;

public class ExampleList {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Hans");
        liste.add("Martin");
        liste.add("Serkan");
        liste.add("Eerkan");
        liste.add("Werkan");
        liste.add("Gerkan");
        liste.add("Lerkan");
        liste.add("Merkan");
        for (String element : liste) {
            System.out.println(element);
        }
        System.out.println("Index von Serkan: " + liste.indexOf("Serkan"));
        liste.remove("Serkan");
        for (String s : liste){
            System.out.println(s);
        }
        System.exit(0);
    }
}
