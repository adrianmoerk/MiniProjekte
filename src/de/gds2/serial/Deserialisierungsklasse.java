package de.gds2.serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisierungsklasse {
    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\phant\\Desktop\\Escuela\\Prog\\Test\\src\\de\\gds2\\serial\\employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e1) {
            e1.printStackTrace();
        }
        System.out.println(e.getName() + " " + e.getVorname());
    }
}
