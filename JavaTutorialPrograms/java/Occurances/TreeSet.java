package Occurances;
import java.util.*;
public class TreeSet {
    //Write program for treeset
    public static void main(String[] args) {
        java.util.TreeSet<String> newTree = new java.util.TreeSet<String>();
        newTree.add("Ravi");
        newTree.add("Vijay");
        newTree.add("Ajay");
        newTree.add("Sujay");
        Iterator<String> iterator = newTree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}