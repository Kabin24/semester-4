package Week5.assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class Main {


    public static void main(String[] args) {

        Display display = new Display();


        System.out.println();
        System.out.println("Welcome to Online Shopping!");
        System.out.println();

        String[] items = new String[5];


        items[0] = "T-shirt";
        items[1] = "Jeans";
        items[2] = "Sneakers";
        items[3] = "Backpack";
        items[4] = "Hat";

        // Display available item to user
        display.DisplayItems(items);

    }
}