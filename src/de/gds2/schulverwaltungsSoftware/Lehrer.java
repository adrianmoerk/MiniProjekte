package de.gds2.schulverwaltungsSoftware;

public class Lehrer extends Mensch {
    String unterrichtsfach;
    Lehrer(String name, int alter, String unterrichtsfach){
        super(name,alter);
        this.unterrichtsfach = unterrichtsfach;
    }
}
