package Occurances;
public class funOverloading {
    //Program for functionOverloading
    public static void main(String[] args) {
        funOverloading object = new funOverloading();
        System.out.println(object.Add(10, 20));
        System.out.println(object.Add(10, 20, 30));
        System.out.println(object.Add(10.5, 20.5));
    }
    public int Add(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }
    public int Add(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber);
    }
    public double Add(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    }
}






