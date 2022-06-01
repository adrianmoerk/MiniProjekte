package de.IGW.rekursion;

public class RekAddition {
    public static void main(String[] args) {
        System.out.println(new RekAddition().rekursiveAddition1toN(10));
        System.out.println(new RekAddition().rekursiveFakultaet(10));
        System.out.println(new RekAddition().rekursiveFibonacci(10));
        System.out.println(new RekAddition().rekursiveGroessterGemeinsamerNenner(40, 20));
    }
// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
    int rekursiveAddition1toN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + rekursiveAddition1toN(n - 1);
    }
    int rekursiveFakultaet(int n) {
        if (n == 1) {
            return 1;
        }
        return n * rekursiveFakultaet(n - 1);
    }

    int rekursiveFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return rekursiveFibonacci(n - 1) + rekursiveFibonacci(n - 2);
    }


    int rekursiveGroessterGemeinsamerNenner(int a, int b) {
        if (b == 0) {
            return a;
        }
        return rekursiveGroessterGemeinsamerNenner(b, a % b);
    }
}
