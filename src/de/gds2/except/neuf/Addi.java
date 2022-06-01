package de.gds2.except.neuf;

import java.util.List;
import java.util.Vector;

public class Addi {
    public static void main(String[] args) {
        Integer zahl1 = 100;
        String name = "eins";
        List myList = new Vector();
        myList.add(zahl1);
        myList.add(10);
        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum = sum + ((int) myList.get(i));
        }
        System.out.println(sum);
    }
}
