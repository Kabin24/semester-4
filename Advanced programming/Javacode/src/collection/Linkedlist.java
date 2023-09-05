package collection;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.ListIterator;

public class Linkedlist {
    public static void main(String[] args) {
//        LinkedList<String> Letter = new LinkedList<String>();
//        //add  element  to the linkedlist
//        Letter.add("k");
//        Letter.add("a");
//        Letter.add("b");
//        Letter.add("i");
//        Letter.add("n");
//        Letter.addLast("s");
//        Letter.addFirst("A");
//        Letter.add(1,"BIB");
//
//     //   System.out.println("Full name =" +Letter);
//
//
//        // removing in linkedlist
//        Letter.remove("BIB");
//        Letter.removeFirst();
//        Letter.removeLast();
//      //  System.out.println( "After  deleting ="+ Letter);
//
//
//
//        // get and set  a value
//        Object val = Letter.get(2);
//        Letter.set(2, (String) val + " Changed");
//       // System.out.println("ll after change: " + Letter);



// example

                Scanner scanner = new Scanner(System.in);

                LinkedList<Integer> num =new LinkedList<>();
                num.add(10);
                 num.add(20);
                 num.add(30);
                 num.add(40);
                 num.add(50);
        System.out.println(num);
                // Input threshold value
                 System.out.print("Enter the threshold value: ");
                 int threshold = scanner.nextInt();

                 // Input the value to be replaced
                 System.out.print("Enter the value to be replaced: ");
                 int oldValue = scanner.nextInt();

                 // Input the value to replace it with
                 System.out.print("Enter the new value: ");
                 int newValue = scanner.nextInt();
                 // Perform the operations: remove elements, replace values
                 ListIterator<Integer> iterator = num.listIterator();
                 while (iterator.hasNext()) {
                     int current = iterator.next();
                     if (current > threshold) {
                         iterator.remove(); // Remove elements greater than threshold
                     } else if (current == oldValue) {
                         iterator.set(newValue); // Replace old value with new value
                     }
                 }

                 // Calculate and print the sum of remaining elements
                 int sum = 0;
                 for (Integer value : num) {
                     sum += value;
                 }
                 System.out.println("Sum of remaining elements: " + sum);

                 // Print the updated LinkedList
                 System.out.println("Updated LinkedList: " + num);
             }
        }



