package week3lab;

// extends - inheritance -- single inheritance
public class SavingAccount extends week3lab.superBankClass {
    double interest;
    double CalAmt;

    //1
    public SavingAccount(String acno, double acbal, double interest ) {
        super(acno,acbal);
        this.interest = interest;
    }
    //2
    public SavingAccount(String acno, double acbal) {
        super(acno,acbal);
    }
    public void DepositeWithInterest(double newAmt) {
        CalAmt = (getBalance() * interest) + newAmt;
        setDepositeWithInterest(CalAmt);
    }
}
