package Week4;
import java.util.ArrayList;

public class collection {
    public static void main(String[] args) {

        // ArrayList ====================
          ArrayList<String> list = new ArrayList<String>();
          list.add("manoj"); // to add
          list.add("kabon");
          list.add("danom");
          list.add("kusal");

          // to change item

        list.set(0,"kirtan");
        System.out.println(list);
       System.out.println(  list.get(0)); // to access  an item

        // to remove an item
          list.remove(1);
        System.out.println(list);

        // to remove all
      //  list.clear();
       // System.out.println(list);

        // to find arraylist size
        list.size();
        System.out.println(list);



    }
}
