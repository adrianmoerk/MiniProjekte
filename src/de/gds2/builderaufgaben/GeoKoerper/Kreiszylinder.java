package de.gds2.builderaufgaben.GeoKoerper;

public class Kreiszylinder {
    private double radius;
    private double hoehe;

    public Kreiszylinder(double radius, double hoehe) {
        this.radius = radius;
        this.hoehe = hoehe;
    }

    public double getRadius() {
        return radius;
    }

    public double getHoehe() {
        return hoehe;
    }

    public double getOberflaeche() {
        return 2.0 * Math.PI * radius * (radius + hoehe);
    }

    public double getVolumen() {
        return Math.PI * Math.pow(this.radius, 2) * hoehe;
    }

    public double getMantelflaeche() {
        return 2.0 * Math.PI * Math.pow(this.radius, 2);
    }
}
