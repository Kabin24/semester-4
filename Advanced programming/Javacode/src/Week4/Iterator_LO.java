package Week4;

import java.util.ArrayList;
import java.util.Iterator;
public class Iterator_LO {

;



        // Iterator vaney ko same looping jastai ho.
        // but used to loop through collections, like
        // ArrayList and HashSet.

        // Difference : iteration vs iterator

        // -> iterator batw hami ley traverse the list
        // in either direction, modify the list during iteration,
        // and obtain the iterator;s current position in the list.



        public static void main(String[] args) {

            ArrayList<String> cars = new ArrayList<>();

            cars.add("BMW");
            cars.add("Audi");
            cars.add("Toyota");
            cars.add("Tesla");
            cars.add("amog");

            Iterator<String> it = cars.iterator();
            // print first item
//            System.out.println(it.next());


            // to loop through a collection

//            - Use: hasNext() and next() method

            while(it.hasNext()){
                System.out.println(it.next());

            }

            // We can also remove () item from a collection



//            while(it.hasNext()){
//                String st = it.next();
//
//                if (st.length() < 4){
//                    it.remove();
//                }
//            }
//            System.out.println(cars);




        }
    }

