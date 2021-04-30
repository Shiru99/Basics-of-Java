/////////////////////////////////   Polymorphism  ////////////////////////////////
//
//      Polymorphism allows us to perform a single action in different ways. In other words polymorphism 
//      allow us to define one interface and have multiple implementation
//      
//      Types of polymorphism:
//
//          1.  RUN-TIME polymorphism (Dynamic Binding/Late Binding/
//                              Overriding: same method with same parameters or signature ) : 
//              - slower
//
//          2.  COMPILE-TIME polymorphism (Static Binding/Early Binding/
//                              Overloading: same method with different parameters or signature ) :
//              - faster
//
//
//         NOTE : variables doesn't get override, variables get hidden
//
//
///////////////////////////////////////////////////////////////////////////////////////////////////


package oops.Polymorphism;


public class MainClass {

    public static void main(String[] args) {
        Dog doggy = new Dog();
        
        Pet petty = doggy;

        doggy.walk();
        petty.walk();            
        // COMPILE-TIME polymorphism : in CTP it checks if walk fn is there in petty
        //                             (if no(no means not even in its parent) ==> gives error)

        // RUN-TIME polymorphism : in RTP it checks walk fn in original object i.e. Doggy (here)

        System.out.println(petty.name+"\t"+doggy.name);         // PETTT   DOGGG
    }
    
}