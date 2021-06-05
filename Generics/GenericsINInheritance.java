package Generics;

import java.rmi.server.ObjID;
import java.util.*;

public class GenericsINInheritance {

    private static void printListWithoutGenerics(List l){
        l.add("Anything int/String");
        l.forEach(System.out::println);
        System.out.println("--------");
        l.remove("Anything int/String");

        Object a = l.get(0);
    }

    /*
        String/Integer is inherited from Object

        Generics for Integer/String doesn't accept Object (parent-type) i.e. generics can't be inherited.
    */

    // Error - can break type safety
    // private static void printList(List<Object> l){
    //     l.forEach(System.out::println);
    // }

    /*
        Unbounded Wildcard '?' - represents an unknown type

        Useful in -
            1. When writing a method which can be employed using functionality provided in Object class
            2. When the code is using methods in the generic class that don’t depend on the type parameter (READ Only) 

    */

    private static void printList(List<?> l){   // READ only

        // l.add("Anything int/String");        // Error (point 2) 
        
        l.forEach(System.out::println);
        System.out.println("------------");

        Object a = l.get(0);
        // l.add(new Object());                 // Error
    }


    /* 
        Upper bound Wildcard - <? extends --- >     // READ only
    */
    private static void printNumbers(List<? extends Number>l){

        // l.add("Anything int/String");        // Error (point 2)
        // l.add(99);                           // Error
        l.forEach(System.out::println);
        System.out.println("------------");

        Object a = l.get(0);
        Number b = l.get(0);
        // l.add(new Object());                 // Error
    }

    /* 
        Lower bound Wildcard - <? super --- >     // allow WRITE in any super of mentioned 

        ? super Number ==> Allows write in super of Numbers but not in special like int/double
        ? super Integer ==> Allows write in super of Integer - Integer/Number

    */
    private static void addNumbers(List<? super Number>l,Number n){
        
        // WRITE :

        l.add(99);
        l.add(2.2);
        // l.add("Fun");                    // Error
        // l.add(new Object());             // Error

        // READ :

        l.forEach(System.out::println);
        System.out.println("------------");

        Object a = l.get(0);
        // Number b = l.get(0);         // Error - Type MisMatch
        System.out.println(l.get(0).getClass().getSimpleName());    // 0.0 - Double
        System.out.println(l.get(1).getClass().getSimpleName());    // 9 - Integer

    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jenny");
        printListWithoutGenerics(names);
        printList(names);
        // printNumbers(names);     // Error
        // addNumbers(names,3);     // Error

        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(99);
        printListWithoutGenerics(integers);
        printList(integers);
        printNumbers(integers);
        // addNumbers(integers,3);      // Error

        List<Double> doubles = new ArrayList<>();
        doubles.add(0.0);
        doubles.add(9.9);
        printListWithoutGenerics(doubles);
        printList(doubles);
        printList(doubles);
        // addNumbers(doubles,3);      // Error

        List<Number> nums = new ArrayList<>();
        nums.add(0.0);
        nums.add(9);
        printListWithoutGenerics(nums);
        printList(nums);
        printList(nums);
        addNumbers(nums,3.3);      // Error

    }
}