package arrayListLinkedList;

import java.util.*;

public class ArrayListlinkedList {
    //Write Program for Linked List
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ravi");
        arrayList.add("Vijay");
        arrayList.add("Ravi");
        arrayList.add("Ajay");
        displayArrayList(arrayList);
        LinkedList<String> linkedListObject = new LinkedList<>();
        linkedListObject.add("Tejashri");
        linkedListObject.add("Serena");
        linkedListObject.add("Swati");
        linkedListObject.add("Shivam");
        displayLinkedList(linkedListObject);
    }

    public static void displayArrayList(ArrayList<String> arrayList) {
        System.out.print("ArrayList: ");
        for (String element : arrayList) {
            System.out.print(element + ", ");
        }
    }

    public static void displayLinkedList(LinkedList<String> LinkedListObject) {
        System.out.print("\nLinkedList: ");
        for (String element : LinkedListObject) {
            System.out.print(element + ", ");
        }
    }
}