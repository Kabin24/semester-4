package collection;
import java.util.ArrayList;
import java.util.Iterator;


public class Iterators {
    public static void main(String[] args) {
        // Make a collection
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//
//        // Get the iterator
//        Iterator<String> it = cars.iterator();
//
//        // Print the first item
//       // System.out.println(it.next());
//
//        //Looping Through a Collection
//        while(it.hasNext()) {
//            System.out.println(it.next());


            //Example
            //Use an iterator to remove numbers less than 10 from a collection:
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> it = numbers.iterator();
        
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);

        }
    }

