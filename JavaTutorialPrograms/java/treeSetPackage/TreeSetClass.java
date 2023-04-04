package treeSetPackage;

import java.util.*;

public class TreeSetClass {
    //Write program for treeset
    public static void main(String[] args) {
        TreeSet<String> treeSetObject = new TreeSet<String>();
        treeSetObject.add("Ravi");
        treeSetObject.add("Vijay");
        treeSetObject.add("Ajay");
        treeSetObject.add("Sujay");
        Iterator<String> iterator = treeSetObject.iterator();
        while (treeSetObject.iterator().hasNext()) {
            System.out.println(iterator.next());
        }
    }
}