//Write program for parameterized and default constructor
package Occurances;
public class default_parameterized_constructor {
    default_parameterized_constructor() {
        System.out.println("Default constuctor-Bike is created");
    }
    default_parameterized_constructor(String n) {
       String object = n;
        System.out.println("Parameterized constuctor-Bike is Activa");
    }
    public static void main(String args[]) {
        default_parameterized_constructor object = new default_parameterized_constructor();
        default_parameterized_constructor object1 = new default_parameterized_constructor("Activa");
    }
}
