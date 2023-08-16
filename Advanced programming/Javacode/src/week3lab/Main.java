package week3lab;

public class Main {

    public static void main(String[] args) {

        //Instant create
        week3lab.SavingAccount sa1 = new week3lab.SavingAccount("010001",2000.00,0.06);
        week3lab.SavingAccount sa2 = new week3lab.SavingAccount("010002",5000.00,0.03);
        //call 1

        week3lab.CurrentAccount ca1 = new week3lab.CurrentAccount("020001",4000.00,5000.00);
        week3lab.CurrentAccount ca2 = new week3lab.CurrentAccount("020002",10000.00,8000.00);

        sa1.DepositeWithInterest(500);
        sa2.DepositeWithInterest(600);
        ca1.deposite(100);
        ca2.deposite(50);

        //overriding - yautai parameter ma value pass garne ho
        displayAccount(sa1);
        displayAccount(sa2);
        displayAccount(ca1);
        displayAccount(ca2);
        week3lab.SavingAccount sa3 = new week3lab.SavingAccount("010003",1000.00);
        displayAccount(sa3);
        //2
    }

    private static void displayAccount(week3lab.SuperBankClass value) {

        value.DisplayAllGivenAccount();
    }

}