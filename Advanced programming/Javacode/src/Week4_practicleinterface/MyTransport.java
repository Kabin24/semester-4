package Week4_practicleinterface;

public class MyTransport {
    public static void main(String[] args) {
        Jetski js =new Jetski("Water",40);
        Bicycle b = new Bicycle("land",20);
        Motobike mb = new Motobike("land",200);
        Aircraft a = new Aircraft("air",1000);

        js.startEngine();
        b.displayToWheel();
        mb.startEngine();
        mb.displayToWheel();
        a.startEngine();
        a.displayToWheel();
        a.displayMaxAltitude();
    }
}
