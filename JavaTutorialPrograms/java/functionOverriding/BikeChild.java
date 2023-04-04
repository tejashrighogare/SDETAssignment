package functionOverriding;

public class BikeChild extends VehicalMain {
    public static void main(String args[]) {
        BikeChild bikeObject = new BikeChild();
        bikeObject.vehicalRun();
    }

    public void vehicalRun() {
        System.out.println("Bike is running safely");
    }
}