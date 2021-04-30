/////////////////////////////////   Interface  ////////////////////////////////
//
//      Interface is used as
//
//          1.  extract :
//          2.  multiple parents :
//
//
//         NOTE : 
//                  1.  interface defines a set of specifications that other classes must implement
//                  2.  Similar to abstract classes, interfaces helps us to achieve abstraction in java
//                  
//          1.  interface can't have instances
//          2.  they don't have constructor
//          3.  thay don't have methods with body (TILL java 8.0) 
//              Cons :  if we are interfacing in 100 classes & we want to add new method we were supposed to 
//                      override it in all 100 classes  
//              after java 8.0 we can add methods with body using "default" keyword, these methods need not be 
//              override 
//              Cons :  if this method is in multiple interfaces, then we again need to override it in class.
//   
//          4.  by default attributes of interface are public,static & final // we can change them.
//          5.  by default methods of interface are public,abstract
//          6.  interface can extend interface but not class
//          7.  class implementing an interface must prrovide imple. for all of its methods unless it's an 
//              abstrct class
//
///////////////////////////////////////////////////////////////////////////////////////////////////

package oops.Interface;

/*

class Student{
    public void study(){
        System.out.println("Student can study");
    }
}
class Youtuber{
    public void Video(){
        System.out.println("Youtuber can create Videos");
    }
}

class Person extends Student,Youtuber{               // ERROR
                                    
}

*/

public class MainClass {
    public static void main(String[] args) {


        Person p1 = new Person();

        // Student s0 = new Student();      ERROR : Cannot instantiate the type Student
        // BUT
        Student s1 = p1;                // Simply its typecasting  
        s1.study();
        // s1.video();                  // ERROR
        
    }
}




abstract interface Youtuber{
    // int x;       // ERROR bz variables are final
    void video() ;
    
    default void uploadVideo(){
        System.out.println("Youtuber can upload Videos");
    }

    default void isLive(){
        System.out.println("YES ! youtuber is alive");
    }
}
abstract interface Student{

    void study();

    default void attend(){
        System.out.println("Students attend classes");
    }
    default void isLive(){
        System.out.println("YES ! Student is alive");
    }
}
class Person implements Youtuber,Student{

    @Override
    public void video() {
        System.out.println("Person is creating videos");

    } 
    @Override
    public void study() {
        System.out.println("Person is Studying");
    }

    @Override                                              // MUST
    public void isLive() {
        System.out.println("YES ! Person is alive");
    }
                                    
}

