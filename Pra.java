import java.util.*;
class Vehicle{
    int vNumber;
}
class Car extends Vehicle{
    public static String carOwner(){
        String N1 = "Manish";
        return N1;
    }
}
public class Pra{
    public static void main(String[] args) {
        System.out.println("hii");
        Vehicle v = new Car();
        
    }
}