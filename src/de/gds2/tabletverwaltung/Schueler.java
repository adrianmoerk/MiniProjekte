package de.gds2.tabletverwaltung;

public class Schueler extends Person {
    private Tablet seinTablet;
    //private Tablet[] meineTablets = new Tablet[];


    public void setTablet(Tablet tablet) {
        this.seinTablet = tablet;
    }

    public Tablet getTablet() {
        return this.seinTablet;
    }
}
