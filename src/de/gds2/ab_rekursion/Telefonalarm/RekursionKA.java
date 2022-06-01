package de.gds2.ab_rekursion.Telefonalarm;

public class RekursionKA {
    public static int erg;

    public static int mult(int x, int y) {
        if (x > 0) {
            erg += y;
            x--;
            mult(x, y);
        }
        return erg;
    }
}
