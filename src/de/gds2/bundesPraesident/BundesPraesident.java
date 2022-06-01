package de.gds2.bundesPraesident;

public class BundesPraesident extends Kunde{
    private int rabatt;

    BundesPraesident(String name, int rabatt){
        super(name);
        this.rabatt = rabatt;
    }
}
