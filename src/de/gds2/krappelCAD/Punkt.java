package de.gds2.krappelCAD;

public class Punkt {
    double x;
    double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setX(int x) {
        this.x = (double) x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setY(int y) {
        this.y = (double) y;
    }

    public void ausgeben() {
        System.out.println(x + "," + y);
    }

}
