package oops.DifferentClasses;
/*
    Anonymous Class :

        A class that have no name is known as anonymous in java. 
        It should be used if you have to override method of class or interface.

        Anonymous inner classes are not closures in Java
*/ 

interface Demo{
    public void presentDemo();
}

public class AnonymousClass {
    public static void main(String[] args) 
    {
        int a = 0; 

        Demo d0 = new Demo()
        {
            int alpha = a;

            // alpha++; 
            // a++;
            /* Error - Local variable defined in an enclosing scope must be final or effectively final */ 

            @Override
            public void presentDemo() {
                alpha++;
                System.out.println("Presenting Demo of Anonymous class");
                closeProject();
            }

            public void closeProject(){
                System.out.println("Project Closed");
            }
        };

        d0.presentDemo();
        // d0.closeProject();   // Error
    }
}
