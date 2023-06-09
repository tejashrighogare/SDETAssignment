package interchangeMatrix;

public class InterchangeMatrixProgram {
    public static void main(String args[]) {
        int inputArray[][]
                = {{2, 9, 8}, {7, 6, 4}, {3, 9, 2}};  //Matrix Declaration and Initialization
        System.out.println("Original array matrix: ");
        printMatrix(inputArray);
        int columnNo = 1, interchangeColumn = 2;
        interchangeColumns(inputArray, columnNo, interchangeColumn);
        int rowNo = 1, interchangeRowNo = 2;
        interchangeRows(inputArray, rowNo, interchangeRowNo);
    }

    public static void printMatrix(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[0].length; j++)
                System.out.print(inputArray[i][j] + " ");
            System.out.println();
        }
    }

    public static void interchangeColumns(int[][] inputArray,
                                          int columnNo, int interchangeColumn) {
        for (int index = 0; index < inputArray.length; index++) {
            int temp = inputArray[index][columnNo - 1];
            inputArray[index][columnNo - 1] = inputArray[index][interchangeColumn - 1];
            inputArray[index][interchangeColumn - 1] = temp;
        }
        System.out.println("After Interchanging Column " + columnNo + " and " + interchangeColumn + " :");
        printMatrix(inputArray);
    }

    public static void interchangeRows(int[][] inputArray, int rowNo, int interchangeRowNo) {
        for (int index = 0; index < inputArray[0].length; index++) {
            int temp = inputArray[rowNo - 1][index];
            inputArray[rowNo - 1][index] = inputArray[interchangeRowNo - 1][index];
            inputArray[interchangeRowNo - 1][index] = temp;
        }
        System.out.println("After Interchanging Row " + rowNo + " and " + interchangeRowNo + " :");
        printMatrix(inputArray);
    }
}