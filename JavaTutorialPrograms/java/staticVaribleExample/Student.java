package staticVaribleExample;
public class Student {
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