package collection;

import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;


public class Hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> name = new HashMap<Integer, String>();


        name.put(1, "kabin");// 1  vaneko key  kabin vaneko   value
        name.put(2, "Manoj");
        name.put(3, "Kusal");
        name.put(4, "Rokjal");
        name.put(5, "sailendra");

        System.out.println("IIMS college friends name =" + name);


        //to access an item
        System.out.println(name.get(1));

        // to remove an item
        name.remove(2);
        System.out.println(name);

        // to clear all
//        name.clear();
//        System.out.println(name);

        // to find how many items there  are
        System.out.println(name.size());

        // loop through hashmap
        // to print keys
        for (Integer i : name.keySet()) {
            System.out.println(i);

        }
        // to print value
        for (String i : name.values()) {
            System.out.println(i);
        }

        // to print together (keys,values)
        for ( Integer i: name.keySet()) {
            System.out.println("Key: "+ i  + " Value: " + name.get(i));

        }

    }
}
