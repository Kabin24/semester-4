package Week4_practicleinterface;

public class Interface {
    //Interface 1 – Wheel system
    public interface WheelSystem {
        public void displayToWheel();
    }
    //Interface 2 – Flight system
    public interface FlightSystem {
        public void displayMaxAltitude();
    }
   // Interface 3 – Engine system
    public interface Engine {
        public void startEngine();
    }
    public interface Registration{
        public void displayRegistrationNumber();
    }

}
