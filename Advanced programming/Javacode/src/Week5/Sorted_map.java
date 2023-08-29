package Week5;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sorted_map {
    public static void main(String[] args) {


        SortedMap<String, Integer> lo = new TreeMap<>();
        lo.put("A", 1);
        lo.put("C", 3);
        lo.put("B", 2);

        // Getting values from the sorted map
        int valueA = lo.get("A");
        System.out.println("Value of A: " + valueA);
        lo.remove("B");

        // Iterating over the elements of the sorted map
        for (String key : lo.keySet()) {
            System.out.println("Key: " + key + ", Value: " + lo.get(key));
        }
    }
}