package de.gds2.thread;

public class MultipleThreadTest {
    public static void main(String[] args) {
        Zaehler zaehler = new Zaehler(100);

        Thread secondThread = new Thread(zaehler, "zweiterThread");

        secondThread.start();
    }
}
