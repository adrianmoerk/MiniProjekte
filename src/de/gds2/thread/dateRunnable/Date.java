package de.gds2.thread.dateRunnable;

public class Date implements Runnable {

    @Override
    public void run() {
        java.util.Date date = new java.util.Date();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " " + date.toString());
        }
    }
}
