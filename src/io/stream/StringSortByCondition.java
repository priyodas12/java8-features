package io.stream;

import java.util.Arrays;

public class StringSortByCondition {
    public static void main(String[] args) {
        String [] s=new String[]{"avs","hdf","essd","des","awq","fgr","jef","dhg"};
        //pick string starts with "d"
        Arrays.asList(s).stream().filter(k->k.startsWith("d")).map(String::toUpperCase).forEach(System.out::println);
        //pick string which length 4
        Arrays.asList(s).stream().filter(k->k.length()==4).map(String::toUpperCase).forEach(System.out::println);
    }
}
