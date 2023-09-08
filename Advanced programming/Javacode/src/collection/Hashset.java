package collection;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {

        //    HashSet<String> cars = new HashSet<String>();
        // cars.add("Mahendra");
        //  cars.add("Volvo");
        //  cars.add("Suzuki");
        //  cars.add("BMW");
        //  cars.add("Mustang");
        //   System.out.println(cars);

        //check if item exists

        //    System.out.println(cars.contains("BMW"));

        // to remove
        //remove()


        //loop
        // for (String j:cars) {
        //    System.out.println(j);
        // example
        HashSet<Integer> num = new HashSet<Integer>();
        num.add(4);
        num.add(7);
        num.add(8);
        // find between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (num.contains(i)) {
                System.out.println(i + "was found in set");

            } else {
                System.out.println(i + "was not found in the set");
            }

        }
    }
}


