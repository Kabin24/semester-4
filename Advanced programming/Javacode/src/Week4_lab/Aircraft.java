package Week4_lab;

public class Aircraft  extends Vehicle implements Interface.Engine,Interface.WheelSystem,Interface.FlightSystem {
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
}
