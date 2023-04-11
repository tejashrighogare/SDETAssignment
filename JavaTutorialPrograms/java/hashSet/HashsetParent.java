package hashSet;

import java.util.*;

public class HashsetParent {
    //Write program for hashset
    public static void main(String[] args) {
        HashSet<String> hashsetObject = new HashSet<String>();
        hashsetObject.add("One");
        hashsetObject.add("Two");
        hashsetObject.add("Three");
        hashsetObject.add("One");
        hashsetObject.add("Seven");
        hashsetObject.add(null);
        hashSetFunction(hashsetObject);
    }

    public static void hashSetFunction(HashSet<String> hashsetObject) {
        Iterator<String> iteratorObject = hashsetObject.iterator();
        while (iteratorObject.hasNext()) {
            System.out.println(iteratorObject.next());
        }
    }
}