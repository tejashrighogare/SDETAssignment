package occurances;
public class JavaExceptionExample {
   public static void functionOfTry(int number)
   {
       try {
           int result = number / 0;
       } catch (ArithmeticException e) {
           System.out.println(e);
       }
       System.out.println("rest of the code...");
   }
    //Write program for Exceptions
    public static void main(String args[]) {
        functionOfTry(100);
    }
}