package Occurances;

import java.util.LinkedList;
import java.util.List;

public class Assignment2
{
	public static String destinationCity(List<List<String>> paths) 
	{
		List<String> out = new LinkedList<>();
		List<String> in = new LinkedList<>();
		for (int i = 0; i < paths.size(); i++) 
		{
			List<String> Elements = paths.get(i);
			String outElement = Elements.get(0);
			String inElement = Elements.get(1);
			out.add(outElement);
			in.add(inElement);
		}
		for (int i = 0; i < out.size(); i++) 
		{
			String inElement = in.get(i);
			if (!out.contains(inElement))
			{
				return inElement;
			}
		}
		return null;
	}

	public static void main(String args[]) 
	{
		List<List<String>> testList = new LinkedList<>();
		List<String> test1 = new LinkedList<>();
		test1.add("London");
		test1.add("New York");
		List<String> test2 = new LinkedList<>();
		test2.add("New York");
		test2.add("Lima");
		List<String> test3 = new LinkedList<>();
		test3.add("Lima");
		test3.add("Sao Paulo");
		testList.add(test1);
		testList.add(test2);
		testList.add(test3);
		//String returnDestination = destinationCity(testList);
 String returnDestination=testList.get(testList.size()-1).get(1);
		System.out.println(returnDestination);
	}
}
