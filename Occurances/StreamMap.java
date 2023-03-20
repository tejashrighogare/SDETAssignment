package Occurances;

import java.util.*;
import java.util.stream.Collectors;
public class StreamMap {
    public static void main(String[] args) {
        square1();
    }
    public static void square1() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        List<Integer> answer = list.stream().map(X -> X * X).
                collect(Collectors.toList());
        System.out.println(answer);
    }

}
