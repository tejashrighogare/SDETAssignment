package arrayJava;

public class ArrayJava {
    //Write program for Array
    public static void main(String[] args) {
        int arrayElements[] = {88, 76, 90, 61, 69};
        printArrayElement(arrayElements);
    }

    public static void printArrayElement(int arrayElements[]) {
        for (int counter = 0; counter < arrayElements.length; counter++)
            System.out.println(arrayElements[counter]);
    }
}