package Occurances;

interface interfaceClass {
    void print();
}
class Mainclass implements interfaceClass {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        //Write program for Interface
        Mainclass object = new Mainclass();
        object.print();
    }
}