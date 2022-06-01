package de.gds2.aggregationKomposition;

public class Greifer extends Werkzeug{
    public Greifer(String art, int verschleiss) {
        super(art, verschleiss);
    }

    @Override
    public void ausgeben() {
        System.out.println("Art: " + this.art + "Verschleiss: " + this.verschleiss);
    }
}
