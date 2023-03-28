//Program for functionOverloading
package Occurances;
public class funOverloading {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        funOverloading object = new funOverloading();
        System.out.println(object.Add(10, 20));
        System.out.println(object.Add(10, 20, 30));
        System.out.println(object.Add(10.5, 20.5));
    }public int Add(int firstNumber, int secondNumber) //Two parameters in the function
    {
        return (firstNumber + secondNumber); //Returns the sum of the two numbers
    }
    public int Add(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber);
    }
    // This function takes two double parameters
    public double Add(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    }
}






