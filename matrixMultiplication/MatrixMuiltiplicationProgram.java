package matrixMultiplication;

public class MatrixMuiltiplicationProgram {
    public static void main(String args[]) {
//creating two matrices
        int matrixA[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int matrixB[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        matrixMultiplication(matrixA, matrixB);
    }

    public static void matrixMultiplication(int[][] matrixA, int[][] matrixB) {
        //creating another matrix to store the multiplication of two matrices
        int matrixC[][] = new int[3][3];  //3 rows and 3 column
        for (int count = 0; count < 3; count++) {
            for (int subCount = 0; subCount < 3; subCount++) {
                matrixC[count][subCount] = 0;
                for (int index = 0; index < 3; index++) {
                    matrixC[count][subCount] += matrixA[count][index] * matrixB[index][subCount];
                }
                System.out.print(matrixC[count][subCount] + " ");
            }
            System.out.println();
        }
    }
}