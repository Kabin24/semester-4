package Week03Tutorial;

public class Manager extends EmployeeThree{
    private String car;
    private int yearborn;
    public Manager(String n, double s, String c,int y) {
        super(n,s);
        car = c;
        yearborn=y;
    }
    public String getCar() {
        return car;
    }
    public int getYearborn(){
        return (2014- yearborn);
    }
    public void displayDetail() {
        super.displayDetail();
        System.out.println("CAR : " + car);
        System.out.println("AGE : "+ getYearborn());
    }

}
