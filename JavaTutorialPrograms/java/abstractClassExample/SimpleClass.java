package abstractClassExample;

public class SimpleClass extends AbstarctClass {
    //Write sample program for abstract class
    public static void main(String args[]) {
        SimpleClass classObject = new SimpleClass();
        classObject.abstractMethod();
    }

    public void abstractMethod() {
        System.out.println("Running safely");
    }
}