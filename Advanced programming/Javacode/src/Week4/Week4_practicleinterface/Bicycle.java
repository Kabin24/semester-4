package Week4.Week4_practicleinterface;

public class Bicycle  extends Vehicle implements Interface.WheelSystem {
    public Bicycle(String t, int s){
        super(t, s);
    }
    public void displayToWheel() {
        System.out.println("Bicycle has 2 wheels");
}
    }