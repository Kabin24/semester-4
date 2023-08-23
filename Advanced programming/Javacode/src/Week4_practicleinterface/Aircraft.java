package Week4_practicleinterface;

public class Aircraft  extends Vehicle implements Interface.Engine,Interface.WheelSystem,Interface.FlightSystem ,Interface.Registration{
    public Aircraft(String t,int s){
        super(t,s);
    }
    public void startEngine(){
        System.out.println("Aircraft engine starts - viuuu");
    }
    public void  displayToWheel(){
        System.out.println("Aircraft has 3 wheels");
    }
    public void displayMaxAltitude(){
        System.out.println("Aircraft altitude is 15000m");
    }
    public void displayRegistrationNumber(){
        System.out.println("Aircraft registration number:3098bG");
    }
}
