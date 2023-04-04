package hashMapPackage;

import java.util.HashMap;

public class HashMapClass {
    //Write program for hashMap
    public static void main(String args[]) {
        HashMap hashmapObject = new HashMap();
        hashmapObject.put("Mango", 1);
        hashmapObject.put("Apple", 2);
        display(hashmapObject);
    }

    public static void display(HashMap hashmapObject) {
        System.out.println("Iterating Hashmap...");
        System.out.println("");
        System.out.println(hashmapObject);
    }
}