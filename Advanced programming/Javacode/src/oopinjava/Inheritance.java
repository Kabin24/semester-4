package oopinjava;

public class Inheritance {
    class Vehicle{
        protected String brand ="Ford"; // vehicle attribute
        public void honk(){           // vehicle method
            System.out.println("Tuut,Tuut!");

        }
    }

 class Car extends  Vehicle{
        private String modelName ="Mustang";  // car attribute

        public static void main(String[] args) {
// Create a myCar object
            Car myCar = new Car();

            // Call the honk() method (from the Vehicle class) on the myCar object
            myCar.honk();

            // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
            System.out.println(myCar.brand + " " + myCar.modelName);


        }


    }
}
