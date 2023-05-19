package lambdaInArrayList;

import java.util.*;

public class LambdaInArraylistProgram {
    //Java ArrayList Program to remove elements of Arraylist using lambda function.
    public static void main(String[] args) {
        List<String> listObject = Arrays.asList("Anil", "Vijay", "Ajay", "Ankt", "Shivam");
        ArrayList<String> arrayList = new ArrayList<String>(listObject);
        System.out.println("An initial list of elements: " + arrayList);
        arrayList.remove("Vijay");
        System.out.println("After invoking remove(object) method: " + arrayList);
        arrayList.remove(0);
        System.out.println("After invoking remove(index) method: " + arrayList);
        List<String> newListObject = Arrays.asList("Ravi", "Hanumant");
        ArrayList<String> newArrayList = new ArrayList<String>(newListObject);
        System.out.println("Updated list : " + newArrayList);
        arrayList.removeAll(newArrayList);
        System.out.println("After invoking removeAll() method: " + arrayList);
        arrayList.removeIf(stringElement -> stringElement.contains("Ajay"));
        System.out.println("After invoking removeIf() method using lambda function: " + arrayList);
    }
}