package staticVaribleExample;

public class Student {
    private int rollno;
    private String name;
    private static String staticVariable = "ITS";

    public Student(int studentRollNo, String studentName) {
        rollno = studentRollNo;
        name = studentName;
    }

    public void displayStudentDetails() {
        System.out.println(rollno + " " + name + " " + staticVariable);
    }
}