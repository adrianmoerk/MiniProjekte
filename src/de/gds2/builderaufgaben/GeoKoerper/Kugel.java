package de.gds2.builderaufgaben.GeoKoerper;

public class Kugel {
    private double radius;

    public Kugel(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getVolumen() {
        return 4.0 / 3.0 * Math.pow(this.radius, 3) * Math.PI;
    }

    public double getOberflaeche() {
        return 4.0 * Math.pow(this.radius, 2) * Math.PI;
    }
}
