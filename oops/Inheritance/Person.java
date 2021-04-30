package oops.Inheritance;

public class Person {
    
    protected String name;

    public Person(){
        System.out.println("person - Constructor without arguments");
    }
    public Person(String name){
        this.name = name;
        System.out.println("person - Constructor with arguments");
    }

    public void walk(){
        System.out.println("person '"+name+"' can walk.");
    }

    public void eat(){
        System.out.println("person '"+name+"' can eat.");
    }
    
}