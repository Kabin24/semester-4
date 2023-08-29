package Week4.assignment;


public class display {
    public static void main(String[] args) {


    System.out.println("Available Items:");
        for (int i = 0; i < item.size(); i++) {
        System.out.println((i + 1) + ". " + item.get(i));
    }
}
