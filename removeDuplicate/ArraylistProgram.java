package removeDuplicate;

import java.util.*;

public class ArraylistProgram {
    //Write a Java Program for remove duplicate of ArrayList using hashSet<> method
    public static void main(String args[]) {

        // create a ArrayList String type
        List<String> listObject = Arrays.asList("Anil", "Vijay", "Anil", "Vijay", "Shiva", "Mahesh", "Ram");
        removeDuplicate(listObject);
    }

    private static void removeDuplicate(List<String> listObject) {
        // print ArrayList
        System.out.println("Original ArrayList : " + listObject);
        // -----Using LinkedHashSet-----
        System.out.println("\nUsing LinkedHashSet:\n");
        // create a set and copy all value of list
        Set<String> stringSet = new LinkedHashSet<>(listObject);
        // create a list and copy all value of set
        List<String> stringList = new ArrayList<>(stringSet);
        // print ArrayList
        System.out.println("Modified ArrayList : " + stringList);
        // -----Using HashSet-----
        System.out.println("\nUsing HashSet:\n");
        // create a set and copy all value of list
        Set<String> stringSetObject = new HashSet<>(listObject);
        // create a list and copy all value of set
        List<String> listStringObject = new ArrayList<>(stringSetObject);
        // print ArrayList
        System.out.println("Modified ArrayList : " + listStringObject);
    }
}