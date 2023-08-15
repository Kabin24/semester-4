package text_IO;
import java.io.IOException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws IOException {
            java.io.File file = new java.io.File("C:\\Semester_4\\Advanced programming\\Javacode\\src\\text_IO\\Score.txt");



        if(file.exists()){
            System.out.println("File already exists");

            System.exit(1);
        }




        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.print("John T Smith ");
        output.println(90);
        output.print("Manoj k Pau del ");
        output.println(85);

        output.close();


//
//            Scanner input = new Scanner(file);
//
//            while (input.hasNext()){
//                String firstName = input.next();
//                String middleName = input.next();
//                String lastName = input.next();
//                int score = input.nextInt();
//                System.out.println(
//                        firstName + " " + middleName + " " + lastName + " " + score
//                );
//            }
//
//            input.close();

        }

    }

