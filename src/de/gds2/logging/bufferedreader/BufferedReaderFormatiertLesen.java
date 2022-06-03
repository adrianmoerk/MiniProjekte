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
            List<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            List<Logobj> logobj = new ArrayList<>();
            for (int i = 0; i < lines.size(); i++) {
                String s = lines.get(i);
                String[] parts = s.split("[,;#]");
                Logobj l = new Logobj(parts[0], parts[1], parts[2], parts[3], parts[4]);
                logobj.add(l);
            }
            for (int i = 0; i < logobj.size(); i++) {
                logobj.get(i).ausgeben();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
