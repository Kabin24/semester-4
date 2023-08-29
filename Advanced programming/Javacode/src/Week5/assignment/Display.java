package Week5.assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Display {

    Main main = new Main();

        public static void DisplayItems(String[] ds) {
            System.out.println("Available Items: ");
            int j = 1;

            for (String i : ds) {
                System.out.println(j + ". " + i);
                j++;


            }

        }
    public void checkCondition(HashSet<String> items_new,String user_selected_item){
        // checking value duplicate then, yeuta statement | choina aarko
        if(items_new.contains(user_selected_item)){
            System.out.println("Item " + "\'" + user_selected_item + "\'" + " is already to added to your cart." );
        }
        else{

            // user ley select gareko item lai hashset mha added.
            items_new.add(user_selected_item);

            System.out.println("Item " + "\'" + user_selected_item + "\'" + "added to your cart." );
        }

    }
    public static void displayUserShopping (HashSet<String> userselected) {
        for (String it : userselected) {
            System.out.println("- " + it);
        }


    }
}




