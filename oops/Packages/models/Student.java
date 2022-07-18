package oops.Packages.models;

public class Student {
    
    String name;
    
    public Student(String name){
        setName(name);
        System.out.println("Student object with name - "+this.name+" has been created Successfully.");
    }

    // Access modifier from class
    public void checkAccessModifiers(){
        this.setName(this.getName());
        this.sayGoodMorning();
        this.getName();
        this.sayHello();
    }

    private void setName(String name){
        this.name = name;
    }

    String sayGoodMorning(){
        return "Good Morning";
    }

    protected String getName(){
        return name;
    }

    public void sayHello(){
        System.out.println("Hello, I am CSE Student.");
    }
}