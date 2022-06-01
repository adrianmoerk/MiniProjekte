package de.gds2.logging.filestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ZeilenweiseLaden {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\filestream\\access.log";
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Path.of(fileName));
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
