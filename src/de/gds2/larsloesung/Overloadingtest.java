package de.gds2.larsloesung;

public class Overloadingtest {

    public static void main(String[] args) {

        //Objekte von Punktklasse
        Punkt punkt1 = new Punkt(1.4, 2.7);
        Punkt punkt2 = new Punkt(2.4, 2.5);
        Punkt punkt3 = new Punkt(1.4, 2.5);
        Punkt punkt4 = new Punkt(1, 100);
        Punkt punkt5 = new Punkt(10, 1);

        //Methoden zum Vergleichen zweier Punkte

        boolean gleichheit = punkt1.pruefen1(punkt3);   //this.getX == Punkt3.getX --> this. ist das Objekt punkt1
        System.out.println(gleichheit);

        punkt1.drucken();
        punkt1.drucken("salami");                        //Test zum �berladen

        boolean gleichheit2 = Punkt.pruefen(punkt1, punkt3);
        System.out.println(gleichheit2);


        Punkt test = new Punkt(1.4, 2.5);
        test.druckePunkt(test.getx(), test.gety(), "dein Punkt ist: ");
        System.out.println(test.dist(1, 110, 10, 1, 1));
        System.out.println(test.dist(1, 110, 10, 1, 2));


    }

}
