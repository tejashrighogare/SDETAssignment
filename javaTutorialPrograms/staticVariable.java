//Write program for static variable
package Occurances;
class Student {
    int rollno;
    String name;
    static String staticVariable = "ITS";
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    void display() {
        System.out.println(rollno + " " + name + " " + staticVariable);
    }
}
public class staticVariable {
    public static void main(String args[]) {
        Student studentobj1 = new Student(111, "Karan");
        Student studentobj2 = new Student(222, "Aryan");
        studentobj1.display();
        studentobj2.display();
    }
}  