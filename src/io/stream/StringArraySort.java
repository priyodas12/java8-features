package io.stream;

import java.util.Arrays;
import java.util.Comparator;

public class StringArraySort {
    public static void main(String[] args) {
        String [] s=new String[]{"avs","hdf","essd","wes","awq"};
        Arrays.asList(s).stream().sorted(Comparator.reverseOrder()).forEach(i-> System.out.println(i));
    }
}
