package de.gds2.collectionClasses.generischeListe;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericList {
    public static void main(String[] args) {
        List<String> genericList = new ArrayList<>();
        List<String> emil = new ArrayList<>();
        genericList.add("Hans");
        genericList.add("Emil");
        genericList.add("Frauke");
        genericList.add("Evelyn");
        genericList.add("Emil");
        genericList.add("Richard");
        genericList.add("Evelyn");
        for (String s : genericList) {
            System.out.println(s);
        }
        System.out.println("Index von Frauke: " + genericList.indexOf("Frauke"));
        genericList.add(2, "Hanna");
        genericList.remove("Emil");
        for (String s : genericList) {
            System.out.println(s);
        }
        System.out.println("Index von Frauke: " + genericList.indexOf("Frauke"));


        LinkedList<String> links = new LinkedList<>();
        links.add("Hans");
        links.add("Emil");
        links.add("Frauke");
        links.add("Evelyn");
        links.add("Emil");
        links.add("Richard");
        links.add("Evelyn");
        System.out.println("Linkeliste");
        for (String s : links){
            System.out.println(s);
        }
    }
}
