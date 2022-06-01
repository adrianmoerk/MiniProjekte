package de.gds2.ab_rekursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int ergebnis = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zahl: ");
        int n = sc.nextInt();
        ergebnis = fibonacci(n);
        System.out.println(ergebnis);
        sc.close();
    }

    private static int fibonacci(int n) {
        int fib;
        if (n == 0 || n == 1) {
            fib = 1;
        } else {
            fib = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return fib;
    }
}
