package ArraySubset;

public class ArraySubsetProgram {
    public static void main(String[] args)
    {
        int []array={1,2,3};
        displayArraySubset(array);
    }
    public static void displayArraySubset(int [] arrayElement)
    {
        for(int count=0;count<arrayElement.length-1;count++)
        {
            System.out.println("[");
        }
    }
}
