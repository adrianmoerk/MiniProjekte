package de.gds2.logging.schreiben.fahrschulaufgabe;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;

public class FahrschulFausformel {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.##");
        Rechnen rechnen = new Rechnen(100);
        String out = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\schreiben\\fahrschulaufgabe\\zahlen.txt";
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(out))) {
            writer.write("Geschwindigkeit [km/h]\t\tca. Anhalteweg[m]\n");
            writer.write("-------------------------------------------\n");
            for (int i = 0; i <= 100; i++) {
                rechnen.setGeschwindigkeit(i);
                writer.write(i + "\t\t\t\t\t\t\t" + df.format(rechnen.getAnhalteweg()));
                writer.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
