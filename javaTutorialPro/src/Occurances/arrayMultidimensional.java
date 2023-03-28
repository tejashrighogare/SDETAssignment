// Write program for multidimentional array
package Occurances;
public class arrayMultidimensional {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int value = 1;
        System.out.println("The 2D array is: ");
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                array[row][column] = value;
                value++;
                System.out.print(array[row][column] + " ");
            }
            System.out.print("\n");
        }
    }
}