package collection;
import java.util.LinkedList;
import java.util.Objects;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> Letter = new LinkedList<String>();
        //add  element  to the linkedlist
        Letter.add("k");
        Letter.add("a");
        Letter.add("b");
        Letter.add("i");
        Letter.add("n");
        Letter.addLast("s");
        Letter.addFirst("A");
        Letter.add(1,"BIB");

        System.out.println("Full name =" +Letter);


        // removing in linkedlist
        Letter.remove("BIB");
        Letter.removeFirst();
        Letter.removeLast();
        System.out.println( "After  deleting ="+ Letter);



        // get and set  a value
        Object val = Letter.get(2);
        Letter.set(2, (String) val + " Changed");
        System.out.println("ll after change: " + Letter);



// example
         class Linklist{
             public static void main(String[] args) {
                 LinkedList<Integer> 
             }
        }
    }

}
