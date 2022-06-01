package de.gds2.vererbung6;

import java.util.Scanner;

public class PizzaStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza pizza1 = new Pizza();
        pizza1.setName("LECKEERPIZZA");
        pizza1.setPreis(1000);
        PizzaSpecial2012 specialpizza = new PizzaSpecial2012();
        specialpizza.setName("SPEZIALPIZZA");
        specialpizza.setPreis(3000);
        specialpizza.setSaucentyp("SWAGGER");
        specialpizza.setSchaerfegrad(9);
        System.out.print("Wähle Saucentyp: ");
        specialpizza.setSaucentyp(sc.next());
        System.out.print("Wähle Schärfegrad: ");
        specialpizza.setSchaerfegrad(sc.nextInt());
        System.out.println("name:"+specialpizza.getName()+"Schärfegrad"+specialpizza.getSchaerfegrad());
    }
}
