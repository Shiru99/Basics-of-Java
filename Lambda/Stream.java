package Lambda;

/*
    
    Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be *pipelined* to produce the desired result.

    Streams don’t change the original data structure, they only provide the result as per the pipelined methods

    basic idea behind stream is pipelining of various methods for each object of collection. 
    e.g. 
            Car1    Car2    Car3    Car4    ...
             
             ^
            token       
            wash        pipelined   ==>
            payment         
            done        

    Different Operations On Stream :

        Intermediate Operations :

            1. map      -  List square = nums.stream().map(x->x*x).collect(Collectors.toList());
            2. filter   -  List evens = nums.stream().filter(num->num%2==0).collect(Collectors.toList());
            3. sorted   -  List result = nums.stream().sorted().collect(Collectors.toList());
        
        Terminal Operations :

            1. collect  -   used to return the result of the intermediate operations on the stream.
            2. forEach  -   nums.stream().map(x->x*x).forEach(y->System.out.println(y));
            3. reduce   -   nums.stream().filter(x->x%2==0).reduce(100,(ans,i)-> ans+i);
                            reduce => ans + i (initial value of ans = 100)

*/

import java.util.*;

public class Stream {
    public static void main(String[] args) {
        
        List<Person> ppl = Arrays.asList(
            new Person("Tiger", "wood", 33), new Person("John", "Doe", 32),
            new Person("Jenny", "Ccc", 28), new Person("James", "Eee", 31),
            new Person("Ross", "tyler", 27), new Person("Jerry", "Eee", 32)
        );

        ppl.stream()
        .filter(p->p.getFirstName().startsWith("J"))
        .forEach(p->System.out.println(p.getFirstName()+" "+p.getLastName()));

        int thirtyPlus = (int) ppl.stream()
        .filter(p->p.getAge()>=30)
        .count();

        System.out.println(thirtyPlus);


        ppl.parallelStream()
        .filter(p->p.getFirstName().startsWith("J"))
        .forEach(p->System.out.println(p.getFirstName()+" "+p.getLastName()));

        /*
            stream() − Returns a sequential stream considering collection as its source.

            parallelStream() −  Returns a parallel Stream considering collection as its source.
                
                parallelStream is the alternative of stream for parallel processing
         */
    }
}
