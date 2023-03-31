package Occurances;
class AnimalClass {
    void eat() {
        System.out.println("eating...");
    }
}
class DogClass extends AnimalClass {
    void bark() {
        System.out.println("barking...");
    }
}
class ChildClass extends DogClass {
    void weep() {
        System.out.println("weeping...");
    }
}
class MultilevelInheritance {
    //Write program for Multilevel Inheritance
    public static void main(String args[]) {
        ChildClass BabyDogObject = new ChildClass();
        BabyDogObject.weep();
        BabyDogObject.bark();
        BabyDogObject.eat();
    }
}