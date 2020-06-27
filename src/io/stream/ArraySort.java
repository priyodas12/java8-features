package io.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort {
    public static void main(String[] args) {
        Integer [] a=new Integer[]{1,4,2,6,3,7,-8};
        //ascending order
        Arrays.asList(a).stream().sorted().forEach(System.out::println);
        System.out.println("------");
        //descending order
        Arrays.asList(a).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
