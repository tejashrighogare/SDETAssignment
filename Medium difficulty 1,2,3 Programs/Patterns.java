public class Patterns {
    public static void main(String args[]) {
        patternNo1();
    }

    public static void patternNo1() {
        for (int i = 1; i <= 4; i++) {
            int n = 4;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}