package Week4;

public class Hashmap {
    public static void main(String[] args) {

        java.util.HashMap<String, String> capitalCities = new java.util.HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
       // System.out.println(capitalCities);

        // Access an item
        System.out.println(capitalCities.get("Norway"));
//
//        // To remove an item, use the remove() method and refer to the key:
        System.out.println(capitalCities.remove("England"));
        System.out.println(capitalCities);
//
      //  To find out how many items there are, use the size() method:

        System.out.println(capitalCities.size());


        //Loop through the items of a HashMap with a for-each loop.
        //
        //Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:


        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
//
//        // To print both
//
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " || value: " + capitalCities.get(i));
        }
    }
}
