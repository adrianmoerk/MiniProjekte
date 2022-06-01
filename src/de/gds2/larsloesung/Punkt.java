package de.gds2.larsloesung;

public class Punkt {

    private double x1, y1;
    private int x = 2, y = 3;
    private int norm = 0;

    public Punkt(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
        this.norm = 1;
    }

    public void setX(double x) {
        this.x1 = x;
    }

    public void setY(double y) {
        this.y1 = y;
    }

    public void setX(int x) {        //�berladen mit anderer Signatur
        this.x = x;                    //braucht kein typecast weil implizit gecastet wird?
    }

    public void setY(int y) {
        this.y = y;
    }


    //L�sung wellstein:
    public void spiegelnX() {
        //y *= -1;  //y = -y;
        this.y = -this.y;

    }

    public void spiegelnY() {
        x *= -1;
    }


    public void spiegelnX(double x) {
        y *= -1;
    }

    public void spiegelnY(double y) {
        x *= -1;
    }

    public void setNorm(int norm) {
        this.norm = norm;
    }


    //L�sung Wellstein:

    public double distL(Punkt pkt) {
        double distance = 0.0;

        distance = Math.sqrt((Math.pow(this.getx() - pkt.getx(), 2) + Math.pow(this.gety() - pkt.gety(), 2)));
        System.out.println("Methode Luftlinie");
        return distance;
    }

    public double distM(Punkt pkt) {
        double distance = 0.0;

        distance = Math.abs(this.x - pkt.x) + Math.abs(this.y - pkt.y);
        System.out.println("Manhatten Methode");
        return distance;
    }


    public double dist(double x1, double y1, double x2, double y2, int norm) {
        if (norm == 1) {
            double distanz = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)); // Berechnet die Luftlinie
            // zwischen den beiden
            // Punkte
            System.out.print("Methode Luftlinie: ");
            return distanz;
        } else if (norm == 2) {
            double manhat = Math.abs(x1 - x2) + Math.abs(y1 - y2); // Berechnet mit Manhatten-Methode die Distanz
            // zwischen beiden Punkte
            System.out.print("Methode Manhtatten: ");
            return manhat;
        } else {
            System.out.println("ein Fehler ist passiert");
            return 0;
        }
    }

    public double getx() {
        return x1;
    }

    public double gety() {
        return y1;
    }

    // L�sung wellstein:
    public static boolean pruefen(Punkt pPunkt1, Punkt pPunkt2) {

        boolean gleich = false;
        if (pPunkt1.getx() == pPunkt2.getx() && pPunkt1.gety() == pPunkt2.gety())
            gleich = true;

        return gleich;
    }

    // AlternativL�sung wellstein:
    public boolean pruefen1(Punkt pPunkt2) {

        boolean gleich = false;
        if (this.getx() == pPunkt2.getx() && this.gety() == pPunkt2.gety())
            gleich = true;

        return gleich;
    }

    public boolean punktgleichheit(double x, double y) {
        return (x == y); // gibt true/false an, pr�ft nicht zwei Punkte!
    }


    // l�sung wellstein:
    public void drucken() {
        System.out.println("x-koordinate: " + this.getx());
        System.out.println("y-koordinate: " + this.gety());
    }

    public void drucken(String text) {
        System.out.println(text + "x-koordinate: " + this.getx());
        System.out.println(text + "y-koordinate: " + this.gety());
    }


    //L�sung Lars:
    public void druckePunkt(double x, double y) { // Methode �berladen!
        System.out.println("(" + x + ", " + y + ")"); // Druckt Koordinaten aus //da in der gleichen Klasse kann ohne
        // getter gearbeitet werden(Wenn man druckePunkt(){ schreibt
    }

    public void druckePunkt(double x, double y, String druckePunkt) {
        System.out.println(druckePunkt + "(" + x + y + ")");

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}