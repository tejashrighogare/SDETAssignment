package functionOverriding;

public class BikeChildClass extends VehicalMainClass {
    public static void main(String args[]) {
        BikeChildClass bikeObject = new BikeChildClass();
        bikeObject.vehicalRun();
    }

    public void vehicalRun() {
        System.out.println("Bike is running safely");
    }
}