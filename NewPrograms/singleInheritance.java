package Occurances;

class Animal2 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("barking...");

    }
}

class singleInheritance {
    public static void main(String args[]) {
        Dog2 d = new Dog2();
        d.bark();
        d.eat();
    }
}