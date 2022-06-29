package de.gds2.collectionClasses.hashmap.objektAufgabe;

public class Schueler {
    private int age;
    private String name;
    private String vorname;

    public Schueler(int age, String name, String vorname) {
        this.age = age;
        this.name = name;
        this.vorname = vorname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}
