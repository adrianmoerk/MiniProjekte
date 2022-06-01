
package de.gds2.ab_rekursion.Telefonalarm;

public class Alarm {

    public static void main(String[] args) {
        Spieler sp1 = new Spieler("Spieler1", "Mustermann", 123456534);
        Spieler sp2 = new Spieler("Spieler2", "Mustermann", 12345534);
        Spieler sp3 = new Spieler("Spieler3", "Mustermann", 12345534);
        Spieler sp4 = new Spieler("Spieler4", "Mustermann", 1234576534);
        Spieler sp5 = new Spieler("Spieler5", "Mustermann", 1234566534);
        Spieler sp6 = new Spieler("Spieler6", "Mustermann", 1234565434);
        Spieler sp7 = new Spieler("Spieler7", "Mustermann", 1234565324);
        Spieler sp8 = new Spieler("Spieler8", "Mustermann", 1234565354);
        Spieler sp9 = new Spieler("Spieler9", "Mustermann", 1234565324);
        Spieler sp10 = new Spieler("Spieler10", "Mustermann", 1234565314);
        Spieler sp11 = new Spieler("Spieler11", "Mustermann", 134565314);
        Spieler sp12 = new Spieler("Spieler12", "Mustermann", 234565314);
        Spieler[] team1 = {sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp10, sp11, sp12};
        telefonalarm(team1);
    }

    public static void telefonalarm(Spieler[] team) {
        Spieler[] halbeliste1 = new Spieler[(team.length / 2)];
        Spieler[] halbeliste2 = new Spieler[(team.length - team.length / 2)];
        for (int i = 0; i < team.length / 2; i++) {
            halbeliste1[i] = new Spieler("", "", 0);
        }
        if (team.length <= 1) {
            return;
        } else {
            System.out.println("___________Neue Halbierung_________");
            System.arraycopy(team, 0, halbeliste1, 0, team.length / 2);
            System.arraycopy(team, team.length / 2, halbeliste2, 0, team.length / 2);
            System.out.println("__________1. Hälfte____________");
            for (int i = 0; i < halbeliste1.length; i++) {
                System.out.println(halbeliste1[i].getName());
            }
            for (int j = 0; j < halbeliste2.length; j++) {
                System.out.println(halbeliste2[j].getName());
            }
        }
        telefonalarm(halbeliste1);
        telefonalarm(halbeliste2);
    }


}
