package oops.Inheritance;

public class Singer extends Person {

    public void sing(){                          // get overloaded
        System.out.println("Singer '"+name+"' can sing.");
    }

    public void eat(String item){                          // get overloaded
        super.walk();  
        System.out.println("Singer '"+name+"' is eatting "+item);
    }

    public static void laugh(){             // method of class not of object
        // System.out.println("Singer"+name+"is laughing.");    // bz name is object variable not class variable
        System.out.println("Singer is laughing.");
    }
}