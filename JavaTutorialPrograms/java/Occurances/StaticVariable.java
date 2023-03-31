package Occurances;
class Student {
    int rollNoStudent;
    String name;
    static String staticVariable = "ITS";
    Student(int rollNo, String studentName) {
        rollNoStudent = rollNo;
        name = studentName;
    }
    void display() {
        System.out.println(rollNoStudent + " " + name + " " + staticVariable);
    }
}
public class StaticVariable {
    //Write program for static variable
    public static void main(String args[]) {
        Student studentobjFirst = new Student(111, "Karan");
        Student studentobjSecond = new Student(222, "Aryan");
        studentobjFirst.display();
        studentobjSecond.display();
    }
}  