package Week4;
import java.util.Scanner;
public class array_ex {
    public static void main(String[] args) {

//        Array Exercise

//        a[index] - accessing an element
//          a[index] = "" - update
        // a. length - return size


        String[] name = new String[5];
        Scanner src = new Scanner(System.in);

        for (int i = 0; i < name.length; i += 1) {
            System.out.println("Enter name: ");
            name[i] = src.nextLine();

        }

        System.out.println("Entered name are: ");

        int j = 0;
        while (j < name.length) {
            System.out.println(name[j]);
            j++;
        }

    }
}
