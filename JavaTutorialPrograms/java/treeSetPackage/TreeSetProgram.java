package treeSetPackage;

import java.util.*;

public class TreeSetProgram {
    //Write program for treeset
    public static void main(String[] args) {
        TreeSet<String> treeSetObject = new TreeSet<String>();
        treeSetObject.add("Ravi");
        treeSetObject.add("Vijay");
        treeSetObject.add("Ajay");
        treeSetObject.add("Sujay");
        displayTreeSet(treeSetObject);
    }

    public static void displayTreeSet(TreeSet<String> treeSetObject) {
        Iterator<String> iterator = treeSetObject.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}