package de.gds2.serial;

public class Employee implements java.io.Serializable {

    private String name;
    private String vorname;
    private static final long serialVersionUID = 54240823489L;

    public Employee(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
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
