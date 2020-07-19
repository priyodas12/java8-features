package io.stream;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {
       //Integer [] a=new Integer[]{3,4,5,1,5,3,2};
       long startTime = System.currentTimeMillis();
       IntStream.range(0,50).filter(i->i%2==0).forEach(System.out::println);
       long endTime = System.currentTimeMillis();
       System.out.println("time taken for stream "+(endTime-startTime));
       startTime = System.currentTimeMillis();
       IntStream.range(0,50).parallel().filter(i->i%2==0).forEach(System.out::println);
       endTime = System.currentTimeMillis();
       System.out.println("time taken for parallel stream "+(endTime-startTime));
    }
}
