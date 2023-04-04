package constructorExample;

public class ConstructorProgram {
    //Write program for parameterized and default constructor
    public static void main(String args[]) {
        ConstructorProgram defaultConstructor = new ConstructorProgram();
        ConstructorProgram parameterizedConstructor = new ConstructorProgram("Activa");
    }

    public ConstructorProgram() {
        System.out.println("This is default constructor");
    }

    public ConstructorProgram(String bikeName) {
        System.out.println("Parameterized constructor Bike is " + bikeName);
    }
}