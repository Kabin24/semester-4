package exercise_IO;

public class currentAccount extends superBankClass {
    double overdraftvalue;
    public currentAccount(String acno, double acbal, double overdraft ) {
        super(acno,acbal);
        this.overdraftvalue = overdraft;
    }
}
