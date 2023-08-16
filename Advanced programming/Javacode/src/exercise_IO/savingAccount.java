package exercise_IO;

// extends - inheritance -- single inheritance
public class savingAccount extends superBankClass {
    double interest;
    double CalAmt;

    //1
    public savingAccount(String acno, double acbal, double interest ) {
        super(acno,acbal);
        this.interest = interest;
    }
    //2
    public savingAccount(String acno, double acbal) {
        super(acno,acbal);
    }
    public void DepositeWithInterest(double newAmt) {
        CalAmt = (getBalance() * interest) + newAmt;
        setDepositeWithInterest(CalAmt);
    }
}
