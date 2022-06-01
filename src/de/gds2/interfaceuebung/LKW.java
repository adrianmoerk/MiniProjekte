package de.gds2.interfaceuebung;

public class LKW implements Drivable {
    public double tempo = 0;
    public static final double asc = 1.0;

    @Override
    public void beschleunigen(double dBeschleunigungszeit) {
        if (dBeschleunigungszeit < 0) return;
        // v = a * t + v0
        // 1/2 * a * t²
        // Anfahrbeschleunigung LKW: 1,0 m/s² PKW: 1,5 m/s²
        tempo = asc * dBeschleunigungszeit * 3.6;
    }

    @Override
    public void verzoegern(double d) {

    }
}
