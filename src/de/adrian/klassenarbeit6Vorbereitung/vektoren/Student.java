package de.adrian.klassenarbeit6Vorbereitung.vektoren;

public class Student {
    private String name;
    private String nachnachme;
    private int id;

    public Student(String name, String nachnachme, int id) {
        this.name = name;
        this.nachnachme = nachnachme;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachnachme() {
        System.out.println(nachnachme);
        return nachnachme;
    }

    public void setNachnachme(String nachnachme) {
        this.nachnachme = nachnachme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
