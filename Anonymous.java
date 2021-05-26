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
        Demo d0 = new Demo(){
            @Override
            public void presentDemo() {
                System.out.println("Presenting Demo of Anonymous class");
            }
        };
        d0.presentDemo();;
    }
}
