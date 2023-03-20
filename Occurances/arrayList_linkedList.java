package Occurances;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arrayList_linkedList {

	public static void main(String[] args) {
		 List<String> al=new ArrayList<String>();    
		  al.add("Ravi");   
		  al.add("Vijay");    
		  al.add("Ravi");    
		  al.add("Ajay");    
		    
		  List<String> al2=new LinkedList<String>();   
		  al2.add("Tejashri");   
		  al2.add("Serena");    
		  al2.add("Swati");    
		  al2.add("Shivam");    
		    
		  System.out.println("arraylist: "+al);  
		  System.out.println("linkedlist: "+al2);  

	}

}
