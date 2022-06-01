package de.adrian.klassenarbeit6Vorbereitung.interfaces;

public class Starter implements Interface{
    private int irgendwas;
    @Override
    public int getIrgendwas() {

        return this.irgendwas;
    }

    @Override
    public void setIrgendwas(int i) {
        this.irgendwas = i;
    }


}
