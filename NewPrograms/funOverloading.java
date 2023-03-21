package Occurances;

public class funOverloading {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        funOverloading obj = new funOverloading();
        System.out.println(obj.Add(10, 20));
        System.out.println(obj.Add(10, 20, 30));
        System.out.println(obj.Add(10.5, 20.5));

    }


    public int Add(int x, int y) //Two parameters in the function
    {
        return (x + y); //Returns the sum of the two numbers
    }

    // This function takes three integer parameters
    public int Add(int x, int y, int z) {
        return (x + y + z);
    }

    // This function takes two double parameters
    public double Add(double x, double y) {
        return (x + y);
    }
}






