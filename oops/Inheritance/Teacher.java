package oops.Inheritance;

public class Teacher extends Person {

    public int age=99;      // String -> Integer // variable hiding
    
    public Teacher(String name){
        // super(name);
        // super();
        this.name = name;  
        System.out.println("In Teacher constructor with arguments");
    }
    public Teacher(){
        // calls person's constructor without arguments automatically
        System.out.println("In Teacher constructor without arguments");
    }
    protected void teach(){                          // get overloaded
        System.out.println("Teacher '"+name +"' can teach.");
    }

    public void eat(){                          // get overloaded
        super.walk();
        super.eat();
        System.out.println("Teacher '"+name+"' can eat.");
    }
    public static void laugh(){
        // System.out.println("Teacher"+name+"is laughing.");   // bz name is object variable not class variable
        System.out.println("Teacher is laughing.");

    }
}