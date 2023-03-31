package Occurances;
import java.util.*;
public class HashMap {
	//Write program for hashMap
	public static void main(String args[]) {
		java.util.HashMap<Integer, String> mapObject = new java.util.HashMap<Integer, String>();
		mapObject.put(1, "Mango");
		mapObject.put(2, "Apple");
		mapObject.put(3, "Banana");
		mapObject.put(4, "Grapes");
		System.out.println("Iterating Hashmap...");
		for(Map.Entry m : mapObject.entrySet()) {
		System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}