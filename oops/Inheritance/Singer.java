package oops.Inheritance;

public class Singer extends Person {

    public int age=99;      // String -> Integer // variable hiding

    protected void sing(){                          // get overloaded
        System.out.println("Singer '"+this.name+"' can sing.");
    }

    public void eat(String item){                          // get overloaded
        super.walk();  
        System.out.println("Singer '"+this.name+"' is eating "+item);
    }

    public static void laugh(){             // method of class not of object
        // System.out.println("Singer "+name+" is laughing.");    // Cannot make a static reference to the non-static field name - bz name is object variable not class variable
        System.out.println("Singer is laughing.");
    }
}