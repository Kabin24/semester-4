package Week4.Week4_practicleinterface;

public class Vehicle {
    private String type;
    private int speed;

    public Vehicle(String t, int s) {
        type = t;
        speed = s;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }
}

