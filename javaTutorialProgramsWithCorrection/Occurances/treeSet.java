package Occurances;
import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> newTree = new TreeSet<String>();
        newTree.add("Ravi");
        newTree.add("Vijay");
        newTree.add("Ajay");
        newTree.add("Sujay");
        Iterator<String> itr = newTree.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
