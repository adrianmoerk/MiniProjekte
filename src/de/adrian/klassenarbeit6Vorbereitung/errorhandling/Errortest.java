package de.adrian.klassenarbeit6Vorbereitung.errorhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Errortest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Zahl: ");
            int a = sc.nextInt();
            if (a < 0) {
                throw new Exception("LAKSDKSAL");
            }
            System.out.println(5 / a);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatch DU opfer");
        } catch (ArithmeticException e) {
            System.out.println("KEK");
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println("ERROR");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        } finally {
            sc.close();
            System.out.println("Finally");
        }
    }
}
