package de.gds2.logging.bufferedreader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderFormatiertLesen {
    public static void main(String[] args) {
        String filename = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\bufferedreader\\dateien\\log.csv";
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filename))) {
            String line;
            List<String> list = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            System.out.println("Anzahl der Zeilen: " + list.size());
            // Aus der liste jede line zu mehreren strings zerlegen, immer am komma fängt ein neuer string an
            List<Logobj> logobj = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i);
                String[] parts = s.split(",");
                Logobj l = new Logobj(parts[0], parts[1], parts[2], parts[3], parts[4]);
                logobj.add(l);
            }
            System.out.println(logobj.get(0).getDatumAusgeloggt());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
