package oops.Inheritance;

public class Person {
    
    protected String name;
    public String age="Null-String";      // String 

    public Person(){
        this.name="Null-String";
        System.out.println("Person-constructor without arguments");
    }
    public Person(String name){
        this.name = name;
        System.out.println("Person-constructor with arguments");
    }

    public void walk(){
        System.out.println("person '"+name+"' can walk.");
    }

    public void eat(){
        System.out.println("person '"+name+"' can eat.");
    }
    
}