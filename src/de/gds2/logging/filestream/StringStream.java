package de.gds2.logging.filestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\filestream\\access.log";
        try {
            Stream<String> lines = Files.lines(Path.of(fileName)).filter(line -> line.contains("apachefriends.gif"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
