package interfacePackage;

public class Mainclass implements InterfaceClass {
    public void interfaceMethod() {
        System.out.println("Hello");
    }

    //Write program for Interface
    public static void main(String[] args) {
        Mainclass object = new Mainclass();
        object.interfaceMethod();
    }
}