package funOverloading;

public class FunOverloading {
    //Program for functionOverloading
    public static void main(String[] args) {
        FunOverloading object = new FunOverloading();
        System.out.println(object.addition(10, 20));
        System.out.println(object.addition(10, 20, 30));
        System.out.println(object.addition(10.5, 20.5));
    }

    public int addition(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }

    public int addition(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber);
    }

    public double addition(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    }
}