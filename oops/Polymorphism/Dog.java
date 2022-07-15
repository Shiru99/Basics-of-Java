package oops.Polymorphism;

public class Dog extends Pet{

    String name = "DOGGG";

    public void walk(){
        System.out.println("Dog is walking");
    }
    
    public void bark(){
        System.out.println("Dog is barking");
    }
}