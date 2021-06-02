package Generics;

public class Autoboxing {
    public static void main(String[] args) {

        int i = -1;     // Primitive DataType 

        Integer i0 = new Integer(9);    // Wrapper Class - Creates New Instance of Integer & assigns value 
        Integer i1 = i;                 // Auto-Boxing

        int x = i1;     // Auto-un-Boxing
    }
}
