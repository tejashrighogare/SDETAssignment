package Occurances;
class constructorClass {
    constructorClass() {
        System.out.println("Default constuctor-Bike is created");
    }
    constructorClass(String string) {
       String object = string;
        System.out.println("Parameterized constuctor-Bike is Activa");
    }
    //Write program for parameterized and default constructor
    public static void main(String args[]) {
        constructorClass objectDefault = new constructorClass();
        constructorClass objectParameterized = new constructorClass("Activa");
    }
}
