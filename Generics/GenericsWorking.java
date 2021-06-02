/*

    Generics concept is introduced in Java language to provide tighter type checks at compile time and to support generic programming. The way to implement generics, the Java compiler applies TYPE ERASURE to:

        1. Replace all type parameters in generic types with their bounds or Object if the type parameters are unbounded. The produced bytecode, therefore, contains only ordinary classes, interfaces, and methods.
        2. Insert type casts if necessary to preserve type safety.
        3. Generate bridge methods to preserve polymorphism in extended generic types.


        List<String> list = new ArrayList<String>();
        list.add("Hello");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s);
        }

        (TYPE ERASURE) ==> 

        List list = new ArrayList();
        list.add("Hello");
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            String s = (String) iter.next();
            System.out.println(s);
        }
            
*/

package Generics;

import java.util.*;

public class GenericsWorking {

    private static void addStringToList(List<String> l0,String s){
        l0.add(s);
        // l0.add(99);  // Error
    }

    private static void addIntToList(List l1,int i){
        l1.add(i);
    }

    public static void main(String[] args) {

        List<String> l = new ArrayList<>(); 
        l.add("Java");
        l.add("Python");
        // l.add(0);    // Error

        addStringToList(l,"C/C++");
        addIntToList(l, 99);

        System.out.println(l);                  // [Java, Python, C/C++, 99]
        // int i = l.get(3);                    // Compile time error 
        // String j = (String) l.get(3);        // RunTimeError - Integer cannot be cast to String
        System.out.println(l.get(3));           // RunTimeError - Integer cannot be cast to String

        /*
            Conclusion :    
                
                1. Generic type is associated with variable not with instance
                2. Generics concept is compile time construct
        */
    }
}