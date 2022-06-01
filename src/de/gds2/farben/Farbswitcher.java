package de.gds2.farben;

public class Farbswitcher {
    public static void main(String[] args) {
        Farben farbe = Farben.ROT;
        switch (farbe){
            case ROT:
                System.out.println("Rot");
                return;
            case BLAU:
                System.out.println("Blau");
                return;
            case SCHWARZ:
                System.out.println("Schwarz");
                return;
            case VIOLETT:
                System.out.println("Violett");
        }
    }
}
