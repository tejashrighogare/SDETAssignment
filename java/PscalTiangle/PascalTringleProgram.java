package PscalTiangle;

public class PascalTringleProgram {
    public static void main(String args[]) {
        displayTriangle(5);
    }

    public static void displayTriangle(int number) {
        int count, subCount,temp;
        for (count = 0; count < number; count++) {
            for (temp = number; temp > count; temp--) {
                System.out.println(" ");
            }
            int counter = 1;
            for (subCount = 0; subCount <= count; subCount++) {
                System.out.println(counter + " ");
                counter = counter * (count - subCount )/ (subCount + 1);
            }
            System.out.println("\n");
        }
    }
}
