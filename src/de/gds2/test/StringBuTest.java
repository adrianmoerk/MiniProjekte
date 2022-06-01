package de.gds2.test;

public class StringBuTest {
    public static void main(String[] args) {
        System.out.println("Start");
        String str = "";
        for (int i = 0; i < 10000000; i++) {
            str += i;
            System.out.println(str);
        }
        System.out.println("fertig");
    }
}
