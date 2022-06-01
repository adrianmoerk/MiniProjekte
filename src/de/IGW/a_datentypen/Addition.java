package de.IGW.a_datentypen;

public class Addition {
    public static void main(String[] args) {
        // Addition

    }
    int rekursivDreiZahlenAddieren(int a, int b, int c) {
        if (a == 0) {
            return b + c;
        }
        return rekursivDreiZahlenAddieren(a - 1, b + c, a);
    }
}
