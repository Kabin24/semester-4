package Week03Tutorial;

public class Clerk extends EmployeeThree{
    private double Cola;
    private int yearborn;
     public Clerk(String n,double s,int y,double c){
         super(n,s);
         yearborn =y;
         Cola =c;
     }
public int getYearborn(){
         return (2014-yearborn);
}


    public void displayDetail() {
        super.displayDetail();
        System.out.println("AGE :" +getYearborn());
        System.out.println("COLA  :" +"RM"+Cola);
    }
}
