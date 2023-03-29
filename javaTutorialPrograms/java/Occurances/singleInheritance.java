package Occurances;
class animalClassFirst {
    void eat() {
        System.out.println("eating...");
    }
}
class dogClassSecond extends animalClassFirst {
    void bark() {
        System.out.println("barking...");
    }
}
class singleInheritance {
    //Write program for Single Inheritance
    public static void main(String args[]) {
        dogClassSecond dogObject = new dogClassSecond();
        dogObject.bark();
        dogObject.eat();
    }
}