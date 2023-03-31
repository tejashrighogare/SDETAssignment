package Occurances;
class AnimalClassFirst {
    void eat() {
        System.out.println("eating...");
    }
}
class DogClassSecond extends AnimalClassFirst {
    void bark() {
        System.out.println("barking...");
    }
}
class SingleInheritance {
    //Write program for Single Inheritance
    public static void main(String args[]) {
        DogClassSecond dogObject = new DogClassSecond();
        dogObject.bark();
        dogObject.eat();
    }
}