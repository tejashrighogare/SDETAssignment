package staticVaribleExample;

public class StaticVariableClass {
    public static void main(String args[]) {
        Student studentOne = new Student(111, "Karan");
        Student studentSecond = new Student(222, "Aryan");
        studentOne.display();
        studentSecond.display();
    }
}