//Write program for foreach loop
package Occurances;
public class forEach {
    public static void main(String[] args) {
        int inputarray[] = {12, 13, 14, 44};
        int total = 0;
        for (int num : inputarray) {
            total = total + num;
        }
        System.out.println("Total: " + total);
    }
}
