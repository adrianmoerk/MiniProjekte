package de.gds2.logging.bufferedreader;

import java.io.IOException;
import java.util.List;

public class BufferedReaderAufgabe1 {
    public static void main(String[] args) {
        String filename = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\bufferedreader\\dateien\\namen.txt";
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filename))) {
            String line;
            List<String> list = new java.util.ArrayList<>();
            while ((line = reader.readLine()) != null) {
                list.add(line);
                System.out.println("Hallo " + line);
            }
            System.out.println("Anzahl der Zeilen: " + list.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
