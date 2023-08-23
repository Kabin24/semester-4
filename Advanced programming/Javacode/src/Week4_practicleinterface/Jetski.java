package Week4_practicleinterface;

public class Jetski extends Vehicle implements Interface.Engine{
    public Jetski(String t, int s) {
        super(t, s);
    }
    public void startEngine() {
        System.out.println("JetSki engine starts - vroosh...vroosh...");
    } }