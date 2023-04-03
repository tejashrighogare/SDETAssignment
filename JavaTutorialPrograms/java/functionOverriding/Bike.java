package functionOverriding;
public class Bike extends Vehical {
    void run() {
        System.out.println("Bike is running safely");
    }
    public static void main(String args[]) {
        Bike bikeObject = new Bike();
        bikeObject.run();
    }
}