



package week3lab;


public class CurrentAccount extends superBankClass {
    double overdraftvalue;
    public CurrentAccount(String acno, double acbal, double overdraft ) {
        super(acno,acbal);
        this.overdraftvalue = overdraft;
    }
}
