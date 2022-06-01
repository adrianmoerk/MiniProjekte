package de.adrian.klassenarbeit6Vorbereitung.generics;

public class JoeGeneric<Joe> {
    private Joe mama;

    public JoeGeneric(Joe mama) {
        this.mama = mama;
    }

    public Joe getMama() {
        return mama;
    }

    public void setMama(Joe mama) {
        this.mama = mama;
    }
}
