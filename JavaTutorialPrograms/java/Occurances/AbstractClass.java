package Occurances;
abstract class AbstarctClass {
    abstract void run();
}
class SimpleClass extends AbstarctClass {
    void run() {
        System.out.println("Running safely");
    }
    //Write sample program for abstract class
    public static void main(String args[]) {
        SimpleClass object = new SimpleClass();
        object.run();
    }
}