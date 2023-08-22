package Week4;

import java.util.ArrayList;

public class arraylist_ex {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();



        cars.add("BMW");
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Tesla");


//        System.out.println(cars.get(1));

        for (int i = 0; i < cars.size(); i+=1 ){
            System.out.println(cars.get(i));
        }
    }
}