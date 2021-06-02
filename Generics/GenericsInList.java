package Generics;

import java.util.Date;
import java.util.ArrayList;

public class GenericsInList {
    public static void main(String[] args) 
    {
        ArrayList l1 = new ArrayList();

        l1.add("Hello");
        l1.add("World");
        l1.add(new Date());

        System.out.println(l1);
        String s = (String) l1.get(0);     // Type Casting is necessary
        System.out.println(s);



        ArrayList<String> l2 = new ArrayList<>();

        l2.add("Hello");
        l2.add("World");
        // l2.add(new Date());      // Error 
    }
}
