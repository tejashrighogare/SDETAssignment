package occurances;
import java.util.*;
public class Hashset {
	//Write program for hashset
	public static void main(String[] args) {
		HashSet<String> hashsetObject = new HashSet<String>();
		hashsetObject.add("One");
		hashsetObject.add("Two");
		hashsetObject.add("Three");
		hashsetObject.add("One");
		hashsetObject.add("Seven");
		hashsetObject.add(null);
		Iterator<String> i = hashsetObject.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}