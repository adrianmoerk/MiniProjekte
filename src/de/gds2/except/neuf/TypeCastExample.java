package de.gds2.except.neuf;

public class TypeCastExample {
    public static void main(String[] args) {
        Object o = "Eine Zeichenkette";
        String s = (String) o;
        System.out.println(s);

        o = Integer.valueOf(42);
        s = (String) o;
        System.out.println(s);
    }
}
