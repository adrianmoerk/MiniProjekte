package de.gds2.lager;

/**
 * Artikel dienen zum Einlagern im Warehouse mit Preis und Artikelnummer
 * @author Adrian
 * @version 4.0
 * **/

public class Artikel {
    /**
     * Der aktuelle Mehrwertseteuersatz.
     * er liegt zur Zeit  bei {@value}
     *
     * @since 1.0
     * **/
    private static final double MEHRWERTSTEUER = 21;

    private String artikelname;

    /**
     * Liefert den Namen eines Artikels zurück
     * @return
     * **/

    public String getArtikelname() {
        return artikelname;
    }

    /**
     * Setzen eines neuen Artikelnamens
     * @param artikelname Zeichenkette, die den Namen des Artikels übergibt
     * **/

    public void setArtikelname(String artikelname) {
        this.artikelname = artikelname;
    }

    public static void main(String[] args) {

    }
}
