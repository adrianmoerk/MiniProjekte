package de.gds2.builderaufgaben.GeoKoerper;

public class Kreiskegel {
    private double radius;
    private double hoehe;

    public Kreiskegel(double radius, double hoehe) {
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
        return Math.PI * Math.pow(radius, 2) * hoehe;
    }

    public double getVolumen() {
        return Math.PI * Math.pow(radius, 2) * hoehe / 3;
    }

    public double getMantelflaeche() {
        return Math.PI * Math.pow(radius, 2);
    }
}
