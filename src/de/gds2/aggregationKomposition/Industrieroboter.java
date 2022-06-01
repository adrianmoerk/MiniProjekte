package de.gds2.aggregationKomposition;


public class Industrieroboter {
    private final int maxAnzahlWerkzeuge = 10;
    private Werkzeug[] werkzeugkasten = new Werkzeug[maxAnzahlWerkzeuge];

    public Industrieroboter() {
    }

    public Werkzeug werkInfo(int platz) {
        return werkzeugkasten[platz];
    }

    public boolean werkzeugHinzufuegen(int platz, Werkzeug werkzeug) {
        boolean bool = false;
        if (platz < 0) {
            System.out.println("Platz unter null");
        }
        if (werkzeugkasten[platz] == null) {
            werkzeugkasten[platz] = werkzeug;
            bool = true;
        }
        if (!bool) {
            System.out.println("Hinzufügen nicht möglich da Platz " + platz + " belegt ist");
        }
        return bool;
    }

    public boolean werkzeugEntfernen(int platz) {
        boolean bool = false;
        if (werkzeugkasten[platz] != null) {
            werkzeugkasten[platz] = null;
            bool = true;
        }
        if (!bool) {
            System.out.println("Der Platz ist schon leer");
        } else {
            System.out.println("Werkzeug entfernt");
        }
        return bool;
    }
}
