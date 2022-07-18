/////////////////////////////////   Execution of JAVA program  ////////////////////////////////
//
//      1.  public class
//      2.  static blocks in-order
//      3.  main function
//      :
//      :
//


//           pass by value or pass by reference :

//         1. Primitive data-types : pass by value
//         2. Non-primitive data-types : pass by reference


///////////////////////////////////////////////////////////////////////////////////////////////////



package oops;

public class Methods {

    public static void main(String args[])
    {
        fun();                                  // from static fns only static fn can be called
        System.out.println(maxOF(33,77));    
        System.out.println(maxOF(33,77,99));       
        fun();
    }  

    static void fun()
    {
        System.out.println("Hello...!");
    }

    public static int maxOF(int a, int b)
    {
        if (a>b) return a;
        else return b;
    }

    static int maxOF(int a, int b, int c)  // method overloading - only different parameters/args
    {
        if (a>b) {
            if (a>c) return a;
            else return c;
        }
        else{
            if (b>c) return b;
            else return c;
        }
    }

    // public static void maxOF(int a, int b)     // ERROR       // overriding
    // {
    //     if (a>b) System.out.println(a);
    //     else  System.out.println(b);
    // }

    public static int maxOF(float a, float b)
    {
        if (a>b) return 0;
        else return 1;
    }

}


