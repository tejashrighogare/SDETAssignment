package transposeOfMatrix;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int totalRows = 2, totalColumns = 3;
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};
        display(matrix);
        // Transpose the matrix
        int[][] transpose = new int[totalColumns][totalRows];
        for (int rowIndex = 0; rowIndex < totalRows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < totalColumns; columnIndex++) {
                transpose[columnIndex][rowIndex] = matrix[rowIndex][columnIndex];
            }
        }
        // Display transposed matrix
        display(transpose);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int[] totalRow : matrix) {
            for (int totalColumn : totalRow) {
                System.out.print(totalColumn + "    ");
            }
            System.out.println();
        }
    }
}