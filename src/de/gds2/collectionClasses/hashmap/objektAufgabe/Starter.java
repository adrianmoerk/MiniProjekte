package de.gds2.collectionClasses.hashmap.objektAufgabe;

import java.util.HashMap;

public class Starter {
    public static void main(String[] args) {
        Schueler s1 = new Schueler(10, "Klaus", "Laus");
        Schueler s2 = new Schueler(16, "Raus", "Laus");
        Schueler s3 = new Schueler(13, "Maus", "Laus");
        Schueler s4 = new Schueler(18, "Haus", "Laus");
        Schueler s5 = new Schueler(19, "Baus", "Laus");
        HashMap<Schueler, Boolean> objectMap = new HashMap<>();
        objectMap.put(s1, true);
        objectMap.put(s2, false);
        objectMap.put(s3, true);
        objectMap.put(s4, false);
        objectMap.put(s5, true);
        for (Schueler schueler : objectMap.keySet()) {
            System.out.println(schueler.getVorname() + " " + schueler.getName() + " Alter: " + schueler.getAge() + " Pünktlich: " + objectMap.get(schueler));
        }

    }
}
