package de.gds2.lambda.person;

import java.time.LocalDate;
import java.util.List;

public class Person {
    public enum Sex {MALE, FEMALE}

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAdress;
    private int age;

    public Person(String name, LocalDate birthday, Sex gender, String emailAdress, int age) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAdress = emailAdress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.birthday.getYear();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printPerson() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.birthday);
        System.out.println(this.emailAdress);
        System.out.println(this.gender);
        System.out.println("------");
    }

    //Schritt: Implementieren Sie eine Methode die nur Personen ausgibt die älter als ein gegebens
    //Alter sind
    public static void printOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() > age) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster, CheckPerson test) {
        for (Person p : roster) {
            p.printPerson();
        }
    }
}
