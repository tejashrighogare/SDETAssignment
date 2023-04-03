package occurances;
public class ForEach {
    //Write program for foreach loop
    public static void main(String[] args) {
        int inputarray[] = {12, 13, 14, 44};
        int total = 0;
        for (int number : inputarray) {
            total = total + number;
        }
        System.out.println("Total: " + total);
    }
}