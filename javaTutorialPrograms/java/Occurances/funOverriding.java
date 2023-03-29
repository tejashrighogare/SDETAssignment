package Occurances;
public class funOverriding {
    void run() {
        System.out.println("Vehicle is running");
    }
}
class Bike extends funOverriding {
    //Write the program for function overriding
    public static void main(String args[]) {
        Bike object = new Bike();
        object.run();
    }
}