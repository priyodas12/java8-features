package io.stream;

import java.sql.Timestamp;
import java.util.Arrays;

public class ParallelStream {

    public static void main(String[] args) {
       Integer [] a=new Integer[]{3,4,5,1,5,3,2};
       long startTime = System.currentTimeMillis();
       Arrays.asList(a).stream().filter(i->i%2==0).parallel().forEach(System.out::println);
       long endTime = System.currentTimeMillis();
       System.out.println("time taken "+(endTime-startTime));
    }
}
