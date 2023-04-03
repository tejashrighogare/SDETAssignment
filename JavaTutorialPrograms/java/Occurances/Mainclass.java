package occurances;
interface InterfaceClass {
    void print();
}
public class Mainclass implements InterfaceClass {
    public void print() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        //Write program for Interface
        Mainclass object = new Mainclass();
        object.print();
    }
}