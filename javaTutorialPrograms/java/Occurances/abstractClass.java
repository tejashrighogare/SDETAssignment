package Occurances;
abstract class abstarctClass {
    abstract void run();
}
class simpleClass extends abstarctClass {
    void run() {
        System.out.println("Running safely");
    }
    //Write sample program for abstract class
    public static void main(String args[]) {
        simpleClass object = new simpleClass();
        object.run();
    }
}

