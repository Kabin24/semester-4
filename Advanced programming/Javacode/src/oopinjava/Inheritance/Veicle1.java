package oopinjava.Inheritance;

public class Veicle1 {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Veicle1 {
    public String modelName = "Mustang";
}
