package de.gds2.collectionClasses.dict;

public class Mitarbeiter {
    private int id;
    private String name;
    private double verdienst;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVerdienst() {
        return verdienst;
    }

    public void setVerdienst(double verdienst) {
        this.verdienst = verdienst;
    }

    public Mitarbeiter(int id, String name, double verdienst) {
        this.id = id;
        this.name = name;
        this.verdienst = verdienst;
    }
}
