package de.gds2.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisierungsklasse {
    public static void main(String[] args) {
        Employee e = new Employee("Schmidt", "Hans");
        System.out.println(e);
        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\serial\\employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialisiertes Objekt gespeichert unter employee.txt\n");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}

