package Occurances;
public class FunOverriding {
    void run() {
        System.out.println("Vehicle is running");
    }
}
class Bike extends FunOverriding {
    //Write the program for function overriding
    public static void main(String args[]) {
        Bike object = new Bike();
        object.run();
    }
}