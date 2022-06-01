package de.gds2.logging.filesreader;

import java.io.FileReader;
import java.io.IOException;

public class GrosseTextdateienLesen {
    public static void main(String[] args) {
        String filename = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\filesreader\\access.log";
        try (FileReader reader = new FileReader(filename)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
