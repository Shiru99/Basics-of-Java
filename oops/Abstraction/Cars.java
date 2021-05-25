package oops.Abstraction;

public abstract class Cars {

    public abstract void accelerating();

    public abstract void breaking();

    public abstract void sold();

    public void Khatara(){
        System.out.println("your car is Khatara...");
    }

    // abstract means implementation of this method will be in its child.

    // abstract can be used only in abstract classes, so class must be abstract

    // and object can't be created of abstract classes.
    
}