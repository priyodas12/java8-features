package io.stream;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {
        //Integer [] a=new Integer[]{3,4,5,1,5,3,2};
        long startTime = System.currentTimeMillis();
        //IntStream.range(0,50).sequential().filter(i->i%2==0).forEach(System.out::println);
        //It will always sequential,wheather you collect as DS or not.
        IntStream.range(0,50).filter(i->i%2==0).mapToObj(i->i).collect(Collectors.toList()).forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        System.out.println("time taken for stream "+(endTime-startTime));

        startTime = System.currentTimeMillis();
        //when you will be collecting the value as any DS(List,Set etc) that time it will be sequential,else it will print random value
        //uncomment line 22 and 14
        //IntStream.range(0,50).sequential().filter(i->i%2==0).forEach(System.out::println);
        IntStream.range(0,50).parallel().filter(i->i%2==0).mapToObj(i->i).collect(Collectors.toList()).forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("time taken for parallel stream "+(endTime-startTime));
    }
}
