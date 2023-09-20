package oopinjava;

public class person {
    private String name;  // private = restricted access

    //Getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String newName) {
        this.name = newName;
    }



    public static void main(String[] args) {
        person myObj = new person();
        myObj.setName("kirtan");
        myObj.setName("kabin");
        System.out.println(myObj.name);
    }
}
