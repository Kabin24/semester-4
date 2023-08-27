package Week4.Week4_practicleinterface;

public class MyTransport {
    public static void main(String[] args) {
        Jetski js =new Jetski("Water",40);
        Bicycle b = new Bicycle("land",20);
        Motobike mb = new Motobike("land",200);
        Aircraft a = new Aircraft("air",1000);
        Glider G = new Glider("air",300);

        js.startEngine();
        b.displayToWheel();
        mb.startEngine();
        mb.displayToWheel();
        a.startEngine();
        a.displayToWheel();
        a.displayMaxAltitude();
        G.displayMaxAltitude();
        G.displayToWheel();
        /// to display  Registration
        a.displayRegistrationNumber(); // Call Registration method for Aircraft
        mb.displayRegistrationNumber(); // call

    }
}
