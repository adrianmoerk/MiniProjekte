package de.gds2.builderaufgaben.weihnachtspraemien;

public class Praemie {
    double bonus;
    boolean alterUeber50;
    double dienstAlter;

    public Praemie(boolean alterUeber50, double dienstAlter) {
        this.alterUeber50 = alterUeber50;
        this.dienstAlter = dienstAlter;
    }

    public double getBonus() {
        if (alterUeber50)
            bonus += 50;
        if (dienstAlter >= 1 && dienstAlter <= 6)
            bonus += 200;
        else if (dienstAlter >= 6)
            bonus += 80 + dienstAlter * 20;
        return bonus;
    }
}
