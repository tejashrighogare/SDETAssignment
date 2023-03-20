package Occurances;

import java.util.*;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> al = new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Sujay");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
