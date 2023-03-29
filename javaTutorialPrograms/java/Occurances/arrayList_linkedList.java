package Occurances;
import java.util.*;
public class arrayList_linkedList {
    //Write Program for Linked List
    public static void main(String[] args) {
        List<String> arrayListObject = new ArrayList<String>();
        arrayListObject.add("Ravi");
        arrayListObject.add("Vijay");
        arrayListObject.add("Ravi");
        arrayListObject.add("Ajay");
        List<String> linkedListObject = new LinkedList<>();
        linkedListObject.add("Tejashri");
        linkedListObject.add("Serena");
        linkedListObject.add("Swati");
        linkedListObject.add("Shivam");
        System.out.println("arraylist: " + arrayListObject);
        System.out.println("linkedlist: " + linkedListObject);
    }
}
