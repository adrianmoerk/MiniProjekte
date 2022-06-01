package de.IGW.rekursion;

public class Rekursion {
    public void rekursion(int i) {
        if (i > 0){
            i = i-1;
            this.rekursion(i);
            System.out.print("\t" + i);
        }
    }

    public static void main(String[] args) {
        Rekursion rek = new Rekursion();
        rek.rekursion(6);
    }
}
