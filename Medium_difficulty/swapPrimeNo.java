public class swapPrimeNo {
    public static void main(String[] args) {
        int[] someArray = {1, 2, 3, 7};
        SwapPrimeNumber(someArray);
    }
    public static void SwapPrimeNumber(int[] X) {
        for (int i = 0; i <= X.length; i++) {
            int lastElement;
            lastElement = X[X.length - 1];
            if (lastElement % 2 != 0) {
                int temp = 0;
                temp = X[i];
                X[i] = X[X.length - 1];
                X[X.length - 1] = temp;
            }
            for (i = 0; i < X.length; i++)
                System.out.print(X[i] + " ");
        }
    }
}


