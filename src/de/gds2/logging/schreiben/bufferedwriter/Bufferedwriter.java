package de.gds2.logging.schreiben.bufferedwriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Bufferedwriter {
    public static void main(String[] args) {
        Path debug_info_path = Path.of("C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\schreiben\\bufferedwriter\\text.txt");
        Charset charset = Charset.forName("UTF-8");
        String text = "OS Build :18362.720";
        try (BufferedWriter writer = Files.newBufferedWriter(debug_info_path, charset, StandardOpenOption.APPEND)) {
            for (int i = 0; i < 10; i++) {
                writer.write(text + "\n");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
