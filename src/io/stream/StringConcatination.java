package io.stream;

import java.util.Arrays;

public class StringConcatination {
    public static void main(String[] args) {
        String [] s=new String[]{"avs","hdf","essd","des","awq","fgr","jef","dhg"};

        Arrays.asList(s).stream().reduce((s1,s2)->s1+"*"+s2).ifPresent(System.out::println);
    }
}
