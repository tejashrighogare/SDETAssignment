package constructorClass;

public class ConstructorClass {
    //Write program for parameterized and default constructor
    public static void main(String args[]) {
        ConstructorClass defaultConstructor = new ConstructorClass();
        ConstructorClass parameterizedConstructor = new ConstructorClass("Activa");
    }

    public ConstructorClass() {
        System.out.println("This is default constructor");
    }

    public ConstructorClass(String bikeName) {
        System.out.println("Parameterized constructor Bike is " + bikeName);
    }
}