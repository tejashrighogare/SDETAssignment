package inheritanceExample;

public class HierarchicalInheritance {
    //Write program for hirarchical Inheritance
    public static void main(String args[]) {
        Cat catObject = new Cat();
        Dog dogObject = new Dog();
        catObject.meow();
        catObject.eat();
        dogObject.eat();
    }
}