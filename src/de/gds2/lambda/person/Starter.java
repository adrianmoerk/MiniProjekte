package de.gds2.lambda.person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        Person p = new Person("Max", LocalDate.parse("2018-12-27"), Person.Sex.MALE, "lmao@gmx.de", 16);
        Person p2 = new Person("Serkan", LocalDate.parse("2018-12-27"), Person.Sex.MALE, "ok@gmail.com", 10);
        Person p3 = new Person("Nerkan", LocalDate.parse("2018-12-27"), Person.Sex.MALE, "okok@gmx.de", 19);
        Person tip = new Person("Tip", LocalDate.parse("2010-01-01"), Person.Sex.MALE, "ok", 10);
        Person trick = new Person("Trick", LocalDate.parse("2009-01-01"), Person.Sex.MALE, "ok", 11);
        Person track = new Person("Track", LocalDate.parse("2011-01-01"), Person.Sex.MALE, "ok", 9);
        Person daisy = new Person("Daisy", LocalDate.parse("1983-01-01"), Person.Sex.MALE, "ok", 39);
        Person donald = new Person("Donald", LocalDate.parse("1973-01-01"), Person.Sex.MALE, "ok", 49);
        List<Person> list = new ArrayList<>();
        list.add(tip);
        list.add(trick);
        list.add(track);
        list.add(daisy);
        list.add(donald);
        Person.printOlderThan(list, 20);
        Person.printPersons(list, (Person pers) -> pers.getAge() > 20);
    }
}
