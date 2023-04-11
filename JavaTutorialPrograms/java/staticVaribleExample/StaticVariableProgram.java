package staticVaribleExample;

public class StaticVariableProgram {
    public static void main(String args[]) {
        Student studentOne = new Student(111, "Karan");
        Student studentSecond = new Student(222, "Aryan");
        studentOne.displayStudentDetails();
        studentSecond.displayStudentDetails();
    }
}