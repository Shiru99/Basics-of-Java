/////////////////////////////////   Polymorphism  ////////////////////////////////
//
//      Polymorphism allows us to perform a single action in different ways. In other words polymorphism 
//      allow us to define one interface and have multiple implementation
//      
//      Types of polymorphism:
//
//          1.  RUN-TIME polymorphism [SLOWER] (Dynamic Binding/Late Binding/Overriding: methods with same parameters  
//              & signature) : 
//
//          2.  COMPILE-TIME polymorphism [FASTER] (Static Binding/Early Binding/Overloading: methods with different   
//              parameters or signature) :
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

        
        // COMPILE-TIME polymorphism 
        // petty.bark();   // error - undefined method bark()
        doggy.bark();   // Dog is barking


        // RUN-TIME polymorphism :
        doggy.walk();   // Dog is walking
        petty.walk();   // Dog is walking


        // variables doesn't get override, variables get hidden
        doggy.petName();    // Pet name is PET-PET
        petty.petName();    // Pet name is PET-PET
        System.out.println(petty.name);         // PET
        System.out.println(doggy.name);         // DOG
    }
}