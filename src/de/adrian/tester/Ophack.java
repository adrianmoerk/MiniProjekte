package de.adrian.tester;

public class Ophack {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(addiere(1, 2));
    }
    // addiere zwei Zahlen rekursiv und gib das Ergebnis aus
    public static int addiere(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return addiere(a + 1, b - 1);
        }
    }
}
