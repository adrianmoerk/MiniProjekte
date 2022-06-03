package de.gds2.logging.schreiben.aufgabe1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TxtDateiSchreiben {
    public static void main(String[] args) {
        String dateiname = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\schreiben\\aufgabe1\\test.txt";
        try {
            Files.writeString(Path.of(dateiname), "Hallo Welt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
