package exercise_IO;



import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws Exception {


//        //Instant create
//        SavingAccount sa1 = new SavingAccount("010001",2000.00,0.06);
//        SavingAccount sa2 = new SavingAccount("010002",5000.00,0.03);
//        //call 1
//
//        CurrentAccount ca1 = new CurrentAccount("020001",4000.00,5000.00);
//        CurrentAccount ca2 = new CurrentAccount("020002",10000.00,8000.00);
//
//        sa1.DepositeWithInterest(500);
//        sa2.DepositeWithInterest(600);
//        ca1.deposite(100);
//        ca2.deposite(50);
//
//        //overriding - yautai parameter ma value pass garne ho
//        displayAccount(sa1);
//        displayAccount(sa2);
//        displayAccount(ca1);
//        displayAccount(ca2);
//        SavingAccount sa3 = new SavingAccount("010003",1000.00);
//        displayAccount(sa3);



        java.io.File file = new java.io.File("C:\\Users\\kabin\\OneDrive\\Desktop\\semester-4\\Advanced programming\\Javacode\\src\\exercise_IO\\saving_data.txt");

        /// saving account
        Scanner sc = new Scanner(file);
        savingAccount sa1 =null;
        ArrayList<savingAccount> accounts =new ArrayList<>();
        while (sc.hasNext()){
            String BankAlc = sc.next();
            double Balance =sc.nextDouble();
            double interest = sc.nextDouble();
            sa1 = new savingAccount(BankAlc,Balance,interest);
            accounts.add(sa1);

        }
        for(savingAccount sav :accounts){
            sav.DepositeWithInterest(500);
            sav.DisplayAllGivenAccount();
        }
    }
        //  Current acccount
        java.io.File file2 = new java.io.File("C:\\Users\\kabin\\OneDrive\\Desktop\\semester-4\\Advanced programming\\Javacode\\src\\exercise_IO\\Current_data.txt");
        Scanner ca = new Scanner(file2);
        currentAccount savAlc1 = null;
        ArrayList<   currentAccount> accounts1 = new ArrayList();

        while (ca.hasNext()) {
            String BankAlc = ca.next();
            double Balance = ca.nextDouble();
            double Interest = ca.nextDouble();

            savAlc1 = new    currentAccount(BankAlc, Balance, Interest);
            accounts1.add(savAlc1);

        }
        for (   currentAccount ca2 : ca_accounts) {
          ca2.DisplayAllGivenAccount();
        }

        private static void displayAccount (superBankClass value){

            value.DisplayAllGivenAccount();
        }

    }
}