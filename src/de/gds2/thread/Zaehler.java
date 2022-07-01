package de.gds2.thread;

public class Zaehler implements Runnable {
    private int count;

    public Zaehler(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < this.count; i++) {
            System.out.println(thread + " " + i);
        }

    }

}
