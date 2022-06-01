package de.gds2.aufgabenblatt3;

public class Rechteck {
    public static void main(String[] args) {
        double a = 8.0, b = 12.0;
        System.out.println("Rechteckfläche: " + rectArea(a, b));
        System.out.println("Quadratfläche: " + rectArea(a));
    }

    private static double rectArea(double a, double b) {
        double area = 0;
        area = a * b;
        return area;
    }

    private static double rectArea(double a) {
        double area = 0;
        area = Math.pow(a, 2);
        return area;
    }
}
