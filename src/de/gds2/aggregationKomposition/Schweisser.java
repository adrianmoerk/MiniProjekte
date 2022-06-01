package de.gds2.aggregationKomposition;

public class Schweisser extends Werkzeug {
    public Schweisser(String art, int verschleiss) {
        super(art, verschleiss);
    }

    @Override
    public void ausgeben() {
        System.out.println("Art: " + this.art + "Verschleiss: " + this.verschleiss);
    }

}
