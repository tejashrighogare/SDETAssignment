package Occurances;

public class arrayMultidimensional {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int value = 1;
        System.out.println("The 2D array is: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = value;
                value++;
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }


    }
}