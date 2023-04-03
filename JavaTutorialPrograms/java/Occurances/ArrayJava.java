package occurances;
public class ArrayJava {
    //Write program for Array
    public static void main(String[] args) {
        int elements[] = {88, 76, 90, 61, 69};
        arrayElement(elements);
    }
    public static void arrayElement(int elementsValue[]) {
// Print the array elements
        for (int i = 0; i < elementsValue.length; i++)
            System.out.println(elementsValue[i]);
    }
}