/*
    Anonymous/Inner class

        A class that have no name is known as anonymous/inner class in java. 
        It should be used if you have to override method of class or interface.
*/ 

@FunctionalInterface
interface Demo{
    public void presentDemo();
}

public class Anonymous {
    public static void main(String[] args) 
    {
        int a = 0; 

        Demo d0 = new Demo()
        {
            int alpha = a;  // Closure

            // a++; 
            /* Error - Local variable defined in an enclosing scope must be final or effectively final */ 

            @Override
            public void presentDemo() {
                System.out.println("Presenting Demo of Anonymous class");
            }
            void closeProject(){
                System.out.println("Project Closed");
            }
        };
        d0.presentDemo();;
    }
}
