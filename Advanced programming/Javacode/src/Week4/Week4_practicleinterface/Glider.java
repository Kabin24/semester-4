package Week4.Week4_practicleinterface;

public class Glider  extends Vehicle  implements Interface.WheelSystem, Interface.FlightSystem{
    public Glider(String t, int s) {
        super(t, s);
    }
    public void displayToWheel() {
        System.out.println("Glider has 3 wheels");
    }

    @Override
    public void displayMaxAltitude() {
        System.out.println("Glider has maximum altitude of 3000m");
    }
}
