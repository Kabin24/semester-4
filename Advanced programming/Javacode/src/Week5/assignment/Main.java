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

        display.DisplayItems(items);

        Scanner src = new Scanner(System.in);
        HashSet<String> items_new = new HashSet<>();


        int i = 0;
        int user_input;

        while(i<=7){

            System.out.println("Select an item to add to your cart (enter item number): ");
            user_input = src.nextInt();


            if(user_input == 0 || user_input>items.length){
                System.out.println("Invalid item number. Please choose a valid item number.");
                continue;
            }

            String user_selected_item = items[user_input-1];

            display.checkCondition(items_new, user_selected_item);

            i++;

            if(i==7){

                System.out.println();
                System.out.println("Would you like to view your cart? (Y/N): ");
                String userViewChoice = src.next();

                if(userViewChoice.equals("Y")){
                    System.out.println();
                    System.out.println("Items in Your Cart: ");

                    display.displayUserShopping(items_new);

                }

                if(userViewChoice != "Y"){
                    System.out.println("Thanks for your shopping !!");
                }


            }


        }


    }


}
