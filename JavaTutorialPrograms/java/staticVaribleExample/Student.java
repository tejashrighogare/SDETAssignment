package staticVaribleExample;

public class Student {
    int rollno;
    String name;
    static String staticVariable = "ITS";

    Student(int studentRollNo, String studentName) {
        rollno = studentRollNo;
        name = studentName;
    }

    void displayStudentDetails() {
        System.out.println(rollno + " " + name + " " + staticVariable);
    }
}