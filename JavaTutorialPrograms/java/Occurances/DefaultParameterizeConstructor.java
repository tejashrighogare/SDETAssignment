package Occurances;
class ConstructorClass {
    ConstructorClass()
    {
        System.out.println("This is default constructor");
    }
    ConstructorClass (String string) {
       String object = string;
        System.out.println("Parameterized constuctor-Bike is Activa");
    }
    //Write program for parameterized and default constructor
    public static void main(String args[]) {
        ConstructorClass objectDefault = new ConstructorClass();
        ConstructorClass objectParameterized = new ConstructorClass("Activa");
    }
}