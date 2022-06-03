package de.gds2.logging.schreiben.listeanzeichenkettenschreiben;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ListeSchreiben {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String dateiname = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\schreiben\\listeanzeichenkettenschreiben\\text.txt";
        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }
        try {
            Files.write(Path.of(dateiname), list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
