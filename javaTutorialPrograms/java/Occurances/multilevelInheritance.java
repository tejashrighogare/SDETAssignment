package Occurances;
class animalClass {
    void eat() {
        System.out.println("eating...");
    }
}
class dogClass extends animalClass {
    void bark() {
        System.out.println("barking...");
    }
}
class childClass extends dogClass {
    void weep() {
        System.out.println("weeping...");
    }
}
class multilevelInheritance {
    //Write program for Multilevel Inheritance
    public static void main(String args[]) {
        childClass BabyDogObject = new childClass();
        BabyDogObject.weep();
        BabyDogObject.bark();
        BabyDogObject.eat();
    }
}
