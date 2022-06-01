package de.IGW.a_datentypen;

public class EinfacheDatentypen {
    public static void main(String[] args) {
        byte ba = 120;
        byte bb = 10;
        byte bc;
        int ic;
        ic = ba + bb;
        bc = (byte) (ba + bb);
        System.out.println(ba + " + " + bb + " = " + bc);
        System.out.println(ba + " + " + bb + " = " + ic);
    }
}
