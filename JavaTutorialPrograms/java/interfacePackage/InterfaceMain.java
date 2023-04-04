package interfacePackage;

public class InterfaceMain implements InterfaceProgram {
    public void interfaceMethod() {
        System.out.println("Interface method");
    }

    //Write program for Interface
    public static void main(String[] args) {
        InterfaceMain Interfaceobject = new InterfaceMain();
        Interfaceobject.interfaceMethod();
    }
}