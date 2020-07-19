package io.stream;

import com.sun.jdi.IntegerValue;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
@priyodas12
taking 0-49 element and string even values in a arraylist,later on we are collecting as list in stream flow.
to avoid race condition synchronized DS taken for parallel stream operation.
*/

public class ParallelStream {

    public static void main(String[] args) {
        //this list will peek value once stream ops done,before collect ops
        List<Object> l1= new ArrayList<>();

        long startTime = System.currentTimeMillis();
        //IntStream.range(0,50).sequential().filter(i->i%2==0).forEach(System.out::println);
        //It will always sequential,whether you collect as DS or not.
        IntStream.range(0,50)
                .filter(i->i%2==0)
                .mapToObj(i->i)
                .peek(i->l1.add(i))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        System.out.println("normal stream thread will peek values like this"+l1);
        System.out.println("time taken for normal stream "+(endTime-startTime));

        startTime = System.currentTimeMillis();
        //storing element in synchronized DS will be best idea while parallel ops done.
        List<Object> l2= Collections.synchronizedList(new ArrayList<>());
        //when you will be collecting the value as any DS(List,Set etc) that time it will be sequential,else it will print random value
        //uncomment line 22 and 14
        //IntStream.range(0,50).parallel().filter(i->i%2==0).forEach(System.out::println);
        IntStream.range(0,50)
                .parallel()
                .filter(i->i%2==0)
                .mapToObj(i-> i)
                .peek(i->l2.add(i))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("parallel stream thread will peek values like this"+l2);
        endTime = System.currentTimeMillis();
        System.out.println("time taken for parallel stream "+(endTime-startTime));
    }
}
