import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) 
    {

        /////////////////////////////////// TRY & CATCH   //////////////////////////////////
        
        int array[] = new int[5];

        try 
        {   
            // System.exit(0);
            // return ;
            System.out.println(array[7]); // Index 7 out of bounds for length 5 (Remove this error.!!)
        }  
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e.getMessage() + " (Remove this error.!!)");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage() + " (Remove this error.!!)");
        } 
        finally             
        {                             
            System.out.println("Error can't be handled, Disconnecting database...");
        }
        // finally runs Always even after return statement
        
        
        
        //////////////////////////////////// Throw Error     ///////////////////////////////////

        /*
            fun(0,0);      // fun without throws
            System.out.println("This must run iff there is no Danger");
        */

        ///////////////   Throws (we know this type of error can be thrown from here)   ////////////////
        
        try{
            fun(9,0);
        }
        catch(Exception e){
            System.out.println(e.getMessage()+" Occurred");
        }

        System.out.println("--------------------");

        try {
            fun(-1,3);
        } catch (ArithmeticException | MyException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------");

        // try_resource - cleans up resources after use (close file, connection, etc)
        try (FileInputStream fis = new FileInputStream("test.txt");) {
            System.out.println("File opened");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("File closed");
        }

    }
    
    static void fun(int one,int two) throws ArithmeticException, MyException
    {
        int a = one;
        int b = two;

        if (b/a == 0)
        {
            throw new ArithmeticException("Danger is coming..."); // throw gives error & stops execution of program.
        }

        if(a<0){
            // try {
                throw new MyException();
            // } catch (MyException e) {
            //     System.out.println(e);            // => toString()
            //     System.out.println(e.toString());
            //     System.out.println(e.getMessage());
            //     e.printStackTrace();
            //     System.out.println("No Exit");
            // }
        }
    }
}

class MyException extends Exception{
    @Override
    public String toString() {
        return "☠️ From custom toString";
    }

    @Override
    public String getMessage() {
        return "☠️ From custom getMessage";
    }


}