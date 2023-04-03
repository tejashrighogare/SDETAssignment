package staticVaribleExample;
public class Student {
    int rollno;
    String name;
    static String staticVariable = "ITS";
    Student(int rollNoVariable, String nameVarible) {
        rollno = rollNoVariable;
        name = nameVarible;
    }
    void display() {
        System.out.println(rollno + " " + name + " " + staticVariable);
    }
}