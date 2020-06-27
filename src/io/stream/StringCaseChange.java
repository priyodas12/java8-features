package io.stream;

import java.util.Arrays;

public class StringCaseChange {
    public static void main(String[] args) {
        String [] s=new String[]{"avs","hdf","essd","wes","awq"};
        Arrays.asList(s).stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
