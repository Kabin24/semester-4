package Week03Tutorial;

public class Officer extends EmployeeThree {
    private double petrol;
    private int yearborn;

    public Officer(String n, double s, double p,int y) {
        super(n, s);
        petrol = p;
        yearborn=y;

    }

    public double getPetrol() {
        return petrol;
    }
    public int getYearborn(){
        return (2014-yearborn);
    }

    public void displayDetail() {
        super.displayDetail();
        System.out.println("PETROL : " + petrol);
        System.out.println("AGE :" +getYearborn());

    }
}
