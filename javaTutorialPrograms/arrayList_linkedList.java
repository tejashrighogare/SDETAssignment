//Write Program for Linked List
package Occurances;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class arrayList_linkedList {
    public static void main(String[] args) {
        List<String> linkedListobj1 = new ArrayList<String>();
        linkedListobj1.add("Ravi");
        linkedListobj1.add("Vijay");
        linkedListobj1.add("Ravi");
        linkedListobj1.add("Ajay");
        List<String> linkedListobj2 = new LinkedList<String>();
        linkedListobj2.add("Tejashri");
        linkedListobj2.add("Serena");
        linkedListobj2.add("Swati");
        linkedListobj2.add("Shivam");
        System.out.println("arraylist: " + linkedListobj1);
        System.out.println("linkedlist: " + linkedListobj2);

    }

}
