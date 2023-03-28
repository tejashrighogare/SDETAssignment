//Write program for StreamMap
package Occurances;
import java.util.*;
import java.util.stream.Collectors;
public class StreamMap {
    public static void main(String[] args) {
        square1();
    }
    public static void square1() {
        List<Integer> listObject = new ArrayList<>();
        listObject.add(10);
        listObject.add(20);
        listObject.add(30);
        listObject.add(40);
        List<Integer> multiplication = listObject.stream().map(multiply -> multiply * multiply).
                collect(Collectors.toList());
        System.out.println(multiplication);
    }
}
