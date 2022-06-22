package de.gds2.logging.schreiben.gradcelsius;

public class Temperaturrechner {
    double celsius;
    double kelvin;

    public Temperaturrechner(double celsius) {
        this.celsius = celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getKelvin() {
        this.kelvin = this.celsius + 273.15;
        return this.kelvin;
    }
}
