package oops.Polymorphism;

public class Pet extends Animal{

    String name = "PETTT";

    public void walk(){
        System.out.println("Pet is walking");
    }

    public void petName(){
        System.out.println("Pet name is "+name);
    }
    
}