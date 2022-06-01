package de.gds2.larsloesung;

public class Rechteck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 8.0, b = 7.6;
		System.out.println("Rechteckfl�che: " + rectArea(a, b));
		System.out.println("Quadratfl�che: " + rectArea(a));
	}

	private static double rectArea(double a) {
		double area = 0;
		area = Math.pow(a, 2);
		return area;
	}

	private static double rectArea(double a, double b) {
		double area = 0;
		area = a*b;
		return area;
	}

}
