package de.gds2.logging.schreiben.advancedCopy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in, out;
        String ordnerPath = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\schreiben\\advancedCopy\\";
        System.out.print("Zu kopierende Datei: ");
        in = sc.next();
        System.out.print("Name für Kopie: ");
        out = sc.next();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(ordnerPath + in)); BufferedWriter writer = Files.newBufferedWriter(Path.of(ordnerPath + out))) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            sc.close();
        }


    }
}
