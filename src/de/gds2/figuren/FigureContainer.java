package de.gds2.figuren;

public class FigureContainer {
    Figure fig;

    public void add(Figure fig) {
        this.fig = fig;
    }

    public Figure getFig() {
        return this.fig;
    }
}
