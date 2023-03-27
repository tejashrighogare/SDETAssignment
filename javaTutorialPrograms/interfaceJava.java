//Write program for Interface
package Occurances;
interface interface1 {
    void print();
}
class Mainclass implements interface1 {
    public void print() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Mainclass obj = new Mainclass();
        obj.print();
    }
}


