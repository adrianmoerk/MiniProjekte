package de.gds2.thread.dateRunnable;

public class ThreadRunner {
    public static void main(String[] args) {
        Date date = new Date();
        Date date2 = new Date();
        Thread t1 = new Thread(date, "Threadderich");
        Thread t2 = new Thread(date2, "Fhread");
        t1.setPriority(9);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
