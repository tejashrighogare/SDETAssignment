package Occurances;
class Animal1
{  
void eat()
{System.out.println("eating...");
}  
}  
class Dog1 extends Animal1
{  
void bark()
{
	System.out.println("barking...");
}  
}  
class BabyDog extends Dog1
{  
void weep()
{System.out.println("weeping...");
}  
}  
class multilevelInheritance{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  
