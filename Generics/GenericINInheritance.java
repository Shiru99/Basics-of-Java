package Generics;

import java.rmi.server.ObjID;
import java.util.*;

public class GenericINInheritance {

    private static void printListWithoutGenerics(List l){
        l.add("Anything int/String");
        l.forEach(System.out::println);
        System.out.println();
        l.remove("Anything int/String");

        Object a = l.get(0);
    }

    /*
        String/Integer is inherited from Object

        Generics for Integer/String doesn't accept Object (parent-type)
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

    private static void printList(List<?> l){

        // l.add("Anything int/String");        // Error (point 2) 
        
        l.forEach(System.out::println);
        System.out.println();

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
        System.out.println();

        Object a = l.get(0);
        Number b = l.get(0);
        // l.add(new Object());                 // Error
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jenny");
        printListWithoutGenerics(names);
        printList(names);
        // printNumbers(names);     // Error

        List<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(99);
        printListWithoutGenerics(nums);
        printList(nums);
        printNumbers(nums);

        List<Double> doubles = new ArrayList<>();
        doubles.add(0.0);
        doubles.add(9.9);
        printListWithoutGenerics(doubles);
        printList(doubles);
        printList(doubles);

    }
}