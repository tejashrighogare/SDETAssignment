package Occurances;
import java.util.*;
public class treeSet {
    //Write program for treeset
    public static void main(String[] args) {
        TreeSet<String> newTree = new TreeSet<String>();
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
