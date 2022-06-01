package de.gds2.logging.filestream;

import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Starter {
    public static void main(String[] args) {
        // Laden einer Textdatei in einen String
        String fileName = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\filestream\\access.log";
        try {
            String text = Files.readString(Path.of(fileName));
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
