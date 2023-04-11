package streamMap;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMap {
    //Write program for StreamMap
    public static void main(String[] args) {
        List<Integer> listObject = new ArrayList<>();
        listObject.add(10);
        listObject.add(20);
        listObject.add(30);
        listObject.add(40);
        square(listObject);
    }

    public static void square(List<Integer> listObject) {

        List<Integer> multiplication = listObject.stream().map(multiply -> multiply * multiply).collect(Collectors.toList());
        System.out.println(multiplication);
    }
}