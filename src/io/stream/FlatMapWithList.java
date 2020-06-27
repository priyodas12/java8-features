package io.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWithList {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a","b","c");
        List<String> list2 = Arrays.asList("a","b","c");
        List<String> list3 = Arrays.asList("a","b","c");

        List<List<String>> listOfLists = Arrays.asList(list1, list2, list3);

        listOfLists.stream().flatMap(x->x.stream()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
