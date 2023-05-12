package lambdaInArrayList;

import java.util.*;

public class LambdaInArraylistProgram {
    //Java ArrayList Program to remove elements of Arraylist using lambda function.
    public static void main(String[] args) {
        ArrayList<String> arrayListObject = new ArrayList<String>();
        arrayListObject.add("Anil");
        arrayListObject.add("Vijay");
        arrayListObject.add("Ajay");
        arrayListObject.add("Ankit");
        arrayListObject.add("Shivam");
        System.out.println("An initial list of elements: " + arrayListObject);
        arrayListObject.remove("Vijay");
        System.out.println("After invoking remove(object) method: " + arrayListObject);
        arrayListObject.remove(0);
        System.out.println("After invoking remove(index) method: " + arrayListObject);
        ArrayList<String> newArrayListObject = new ArrayList<String>();
        newArrayListObject.add("Ravi");
        newArrayListObject.add("Hanumant");
        arrayListObject.addAll(newArrayListObject);
        System.out.println("Updated list : " + arrayListObject);
        arrayListObject.removeAll(newArrayListObject);
        System.out.println("After invoking removeAll() method: " + arrayListObject);
        arrayListObject.removeIf(stringElement -> stringElement.contains("Ajay"));
        System.out.println("After invoking removeIf() method using lambda function: " + arrayListObject);
    }
}