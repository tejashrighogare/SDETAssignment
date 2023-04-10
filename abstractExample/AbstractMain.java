package abstractExample;

public class AbstractMain extends AbstarctProgram {
    //Write sample program for abstract class
    public static void main(String args[]) {
        AbstractMain abstarctObject = new AbstractMain();
        abstarctObject.abstractMethod();
    }

    public void abstractMethod() {
        System.out.println("Running safely");
    }
}