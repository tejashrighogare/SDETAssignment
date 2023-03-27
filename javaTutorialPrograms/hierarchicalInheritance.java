//Write program for hirarchical Inheritance
package Occurances;
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}
class hierarchicalInheritance {
    public static void main(String args[]) {
        Cat catObject = new Cat();
        catObject.meow();
        catObject.eat();
    }
}
