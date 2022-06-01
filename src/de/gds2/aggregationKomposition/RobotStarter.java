package de.gds2.aggregationKomposition;

public class RobotStarter {
    public static void main(String[] args) {
        Industrieroboter rob = new Industrieroboter();
        Bohrer bohrer = new Bohrer("Superbohrer", 30, 5);
        rob.werkzeugHinzufuegen(1, bohrer);
        rob.werkInfo(1).ausgeben();
        Bohrer bohrer1 = new Bohrer("GG", -1, 5);
        System.out.println(rob.werkzeugEntfernen(1));
    }
}
