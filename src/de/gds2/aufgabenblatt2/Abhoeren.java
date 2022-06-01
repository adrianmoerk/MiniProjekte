package de.gds2.aufgabenblatt2;

import java.util.StringTokenizer;

public class Abhoeren {
    public static void main(String[] args) {
        String vergleich;
        String[] wortliste = {"SpaghettiMonster", "IS", "Politikverdrossenheit", "AlQuida", "Sturm", "Kapitol", "Bananenbrot", "Praesident"};
        StringTokenizer st = new StringTokenizer("SpaghettiMonster Jesus Gamer IS Politik AlQuida");
        while (st.hasMoreTokens()) {
            vergleich = st.nextToken();
            for (String s : wortliste) {
                if (vergleich.equalsIgnoreCase(s)) {
                    System.out.println("ALARM\t" + s);
                }
            }
        }
        StringBuffer sb = new StringBuffer("swag");
        sb.append("gggg");
        sb.insert(2,"lol");
        String str = sb.toString();
        sb.reverse();
        System.out.println(sb);

    }



}
