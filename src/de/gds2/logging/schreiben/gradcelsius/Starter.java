package de.gds2.logging.schreiben.gradcelsius;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;

public class Starter {
    public static void main(String[] args) {
        String in = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\schreiben\\gradcelsius\\gradcelsius.txt";
        String out = "C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\logging\\schreiben\\gradcelsius\\kelvin.txt";
        Temperaturrechner rechner = new Temperaturrechner(0);
        DecimalFormat df = new DecimalFormat("0.##");
        try (BufferedReader reader = Files.newBufferedReader(Path.of(in));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(out))) {
            double cel;
            String line = "";
            while ((line = reader.readLine()) != null) {
                cel = Double.parseDouble(line);
                rechner.setCelsius(cel);
                writer.write(cel + "°" + ";" + df.format(rechner.getKelvin()) + "k\n");
            }

        } catch (Error | IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
