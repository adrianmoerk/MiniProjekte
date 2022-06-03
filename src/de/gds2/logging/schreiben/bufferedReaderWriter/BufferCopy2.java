package de.gds2.logging.schreiben.bufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferCopy2 {
    // Gleiches programm wie BufferCopy nur ohne Hilfe
    public static void main(String[] args) {
        String pfad = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\schreiben\\bufferedReaderWriter\\Vorlage_Debug.info";
        String speicherPfad = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\schreiben\\bufferedReaderWriter\\DebugCopyTest.txt";
        try (BufferedReader reader = Files.newBufferedReader(Path.of(pfad)); BufferedWriter writer = Files.newBufferedWriter(Path.of(speicherPfad))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}
