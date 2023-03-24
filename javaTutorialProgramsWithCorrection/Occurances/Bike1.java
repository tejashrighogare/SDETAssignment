package Occurances;

public class Bike1 {
    String b1;

    Bike1() {
        System.out.println("Default constuctor-Bike is created");
    }

    Bike1(String n) {
        b1 = n;
        System.out.println("Parameterized constuctor-Bike is Activa");
    }

    public static void main(String args[]) {
        Bike1 b = new Bike1();
        Bike1 b1 = new Bike1("Activa");
    }
}
