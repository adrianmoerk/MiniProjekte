package de.gds2.ka6;

public class Addierer {
    public static void main(String[] args) {
        String[] argf = {"1", "2"};
        long maxInt = Integer.MAX_VALUE;

        try {
            long aux = 0;
            if (aux > maxInt) {
                throw new Exception("Aux ist größer als maxInt");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException" + e);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException" + e);
        } catch (Exception e) {
            System.out.println("Fehler: " + e);
        }
    }
}
