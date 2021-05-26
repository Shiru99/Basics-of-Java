/*
    Annotation :    
        
        Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.

        @Override 
        @Deprecated
        @SuppressWarnings
        @FunctionalInterface


    A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface

*/

@FunctionalInterface
interface Cars 
{
    public abstract void accelerating();
}

class RacingCar implements Cars
{
    @Override           
    public void accelerating() {
        System.out.println("Racing Car is Accelerating....");
    }

    @Deprecated
    public void removeHelmet(){
        System.out.println("Driver can remove helmet while driving");
    }

}
public class Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {
        RacingCar F1 = new RacingCar();
        F1.removeHelmet();
    }
}
