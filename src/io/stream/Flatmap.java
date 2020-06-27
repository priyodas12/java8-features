package io.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Stream.flatMap() helps in converting Collection<Collection<T>> to Collection<T>.
flatMap() = map() + Flattening
*/

public class Flatmap {
    public static void main(String[] args) {
        String[][] a = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        List<String> al= Arrays.stream(a).flatMap(x->Arrays.stream(x)).collect(Collectors.toList());
        al.stream().forEach(System.out::println);
    }
}
