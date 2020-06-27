package io.stream;

import java.util.Arrays;

public class StringSortByCondition {
    public static void main(String[] args) {
        String [] s=new String[]{"avs","hdf","essd","des","awq","fgr","jef","dhg"};
        Arrays.asList(s).stream().filter(k->k.startsWith("d")).map(String::toUpperCase).forEach(System.out::println);
    }
}
