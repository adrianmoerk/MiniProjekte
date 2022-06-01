package de.gds2.krappelCAD;

import java.util.Scanner;

public class KrappelCAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib den Punkt 1 ein (erst X dann Y)");
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt();
        p1.setX(sc.nextDouble());
        p1.setY(sc.nextDouble());
        System.out.println("Gib den Punkt 2 ein (erst X dann Y)");
        p2.setX(sc.nextDouble());
        p2.setY(sc.nextDouble());
        drucken("Punkt 1: ", p1.getX(), p1.getY());
        drucken("Punkt 2: ", p2.getX(), p2.getY());
        if (gleich(p1.getX(), p1.getY(), p2.getX(), p2.getY())) {
            drucken(gleich(p1.getX(), p1.getY(), p2.getX(), p2.getY()));
        } else {
            drucken("Distance: ", distance(p1.getX(), p1.getY(), p2.getX(), p2.getY()));
            drucken("Manhatten-Distance: ", manhattenDistance(p1.getX(), p1.getY(), p2.getX(), p2.getY()));
        }
    }

    public static void drucken(String str, double dist) {
        System.out.println(str + dist);
    }

    public static void drucken(double x, double y) {
        System.out.println("(" + x + "," + y + ")");
    }

    public static void drucken(String str, double x, double y) {
        System.out.println(str + "(" + x + "," + y + ")");
    }

    public static void drucken(boolean gleich) {
        if (gleich) {
            System.out.println("Beide Punkte sind Gleich");
        }
    }


    public static boolean gleich(double x1, double y1, double x2, double y2) {
        boolean gleich;
        if (x1 == x2 && y1 == y2) {
            gleich = true;
        } else {
            gleich = false;
        }
        return gleich;
    }

    public static double spiegelnX(double y) {
        y = -y;
        return y;
    }

    public static double spiegelnY(double x) {
        x = -x;
        return x;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double distance = 0;
        distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((x1 - x2), 2));
        return distance;
    }

    public static double manhattenDistance(double x1, double y1, double x2, double y2) {
        double distance = 0;
        distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return distance;
    }
}
