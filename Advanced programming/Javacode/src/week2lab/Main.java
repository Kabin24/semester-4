package week2lab;

    import java.util.Scanner;

    public class Main {

//    LAB WEEK 02 – Exercise 2
//    INSTANTIATION & ENCAPSULATION EXERCISE

        public static void main(String[] args) {

            Scanner src = new Scanner(System.in);

//    book 1
            String b1t = "The Enigma Code";
            String b1isbnNo = "978-1234567890";
            String b1status = "Available";

//    book 2
            String b2t = "Journey to the Stars";
            String b2isbnNo = "978-9876543210";
            String b2status = "Checked Out";

            System.out.println("WELCOME TO IIMS-LIBRARY SYSTEM\n");

            System.out.println("Details of Available Books: \n");

            System.out.println("Title: " + b1t + "\n" + "ISBN NO: " +  b1isbnNo + "\n" + "Status: " + b1status);
            System.out.println("---------------------------------");
            System.out.println("Title: " + b2t + "\n" + "ISBN NO: " +  b2isbnNo + "\n" + "Status: " + b2status);

            System.out.println("-------------------------------------------------------------");

//        4. Apply a late fee of $5.00 to both books for overdue returns.
            double lateFee = 5.00;

            System.out.println("Title: " + b1t + "\n" + "ISBN NO: " +  b1isbnNo + "\n" + "Status: " + b1status + "\n" + "Fine: " + lateFee);

            System.out.println("Title: " + b2t + "\n" + "ISBN NO: " +  b2isbnNo + "\n" + "Status: " + b2status + "\n" + "Fine: " + lateFee);



            System.out.println("-------------------------------------\n");

            System.out.println("Enter your name: ");
            String newMember = src.nextLine();


            String memberId = "1001";

            System.out.println("New Member Created: ");
            System.out.println("Name: " + newMember + "\n" + "Member ID: " + memberId);

            System.out.println("-------------------------------------\n");

            //            7. Allow Emily Johnson to borrow "The Enigma Code" book.

            System.out.println("Do you wanna borrow book (y/n) : ");

            String userInput = src.next();

            if(userInput.toUpperCase().equals("Y")){
                System.out.println("\nAvailable Book: \n");
                System.out.println("Title: " + b1t + "\n" + "ISBN NO: " +  b1isbnNo + "\n" + "Status: " + b1status);

                System.out.println("Do you wanna borrow, " + b1t + " ?. (y/n)");
                String userBorrowInput = src.next();
                if(userBorrowInput.toUpperCase().equals("Y")){

                    //8. Display the updated status of both books and Emily Johnson's borrowing status.
                    String newStatus = "Borrowed";


                    System.out.println("Title: " + b1t + "\n" + "ISBN NO: " +  b1isbnNo + "\n" + "Status: " + newStatus  + "\nBorrowed by: " + newMember);
                    System.out.println("---------------------------------");
                    System.out.println("Title: " + b2t + "\n" + "ISBN NO: " +  b2isbnNo + "\n" + "Status: " + b2status);



                }



            }








        }





    }


