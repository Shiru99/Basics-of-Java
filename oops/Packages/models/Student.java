package oops.Packages.models;

public class Student {
    
    String name;
    public Student(String name){
        this.name = name;
        System.out.println("Student object with name - "+this.name+" has been created Successfully.");
    }

    String getName(){
        return name;
    }
}