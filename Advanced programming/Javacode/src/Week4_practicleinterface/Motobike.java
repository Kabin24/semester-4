package Week4_practicleinterface;

public class Motobike extends Vehicle implements Interface.Engine, Interface.WheelSystem,Interface.Registration {
    public Motobike(String t, int s) {
        super(t, s);
    }
    public void startEngine() {
        System.out.println("Motobike engine starts - vroom...vroom...");
    }
    public void displayToWheel() {
        System.out.println("Motobike has 2 wheels");
    }
    public void displayRegistrationNumber(){
        System.out.println("Motobike registration number:Ba23ko");
    }

}
