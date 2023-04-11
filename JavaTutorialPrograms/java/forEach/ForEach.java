package forEach;

public class ForEach {
    public void forEachFunction(int[] inputArray) {
        int total = 0;
        for (int number : inputArray) {
            total = total + number;
        }
        System.out.println("Total: " + total);
    }
}