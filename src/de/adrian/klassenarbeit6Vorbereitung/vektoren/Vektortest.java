package de.adrian.klassenarbeit6Vorbereitung.vektoren;

import java.util.Vector;

public class Vektortest {
    public static void main(String[] args) {
        Vector<Student> vec = new Vector<>();
        Student st1 = new Student("Topf", "Hans", 12345);
        Student st2 = new Student("Teller", "Hannes", 12323);
        Student st3 = new Student("Besteck", "Maxi", 12345);
        vec.add(st1);
        vec.add(st2);
        vec.add(st3);
        //gebe alle namen der studenten aus vec aus
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(vec.elementAt(i).getName());
        }

    }
}
