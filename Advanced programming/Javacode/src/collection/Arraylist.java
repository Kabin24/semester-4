package collection;
import java.util.ArrayList;
public class Arraylist {
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

        // to access  an item
        System.out.println(  list.get(0));

        // to remove an item
        list.remove(1);
        System.out.println(list);

        // to remove all
        //  list.clear();
        // System.out.println(list);

        // to find arraylist size

        System.out.println(list.size());

        // loop through arraylist
        for (int i =0; i< list.size();i++){
            System.out.println(list.get(i));
        }

        // example

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(12);
        num.add(23);
        num.add(45);
        num.add(56);
        num.add(78);

        System.out.println(num);
        for ( int i =0; i< num.size();i++){
            System.out.println(num.get(i));
        }

        for ( int i : num){
            System.out.println(i);
        }


    }}
