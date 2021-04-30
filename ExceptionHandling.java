public class ExceptionHandling {

    public static void main(String[] args) {

        /////////////////////////////////// TRY & CATCH   //////////////////////////////////
        /*
        try {
            // int a = 100;
            // int b = 0;
            // System.out.println(a/b); // Exception in thread "main"
            // java.lang.ArithmeticException: divide by zero

            int array[] = new int[5];
            // System.out.println(array); // [I@1eb44e46
            System.out.println(array[7]); // Index 7 out of bounds for length 5 (Remove this error.!!)
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " (Remove this error.!!)");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " (Remove this error.!!)");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " (Remove this error.!!)");
        } finally {                                             // finally runs Always
            System.out.println("Error can't be handled");
        }
        */
        //////////////////////////////////////   creating Delay ////////////////////////////////////////////
        /*
        System.out.println("Imp. code");

        // Delay of 3 sec:
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("must run.!!!");
        */
        
    
        
        //////////////////////////////////// Throw Error     ///////////////////////////////////

        /*
            fun();
            System.out.println("This must run iff there is no Danger");
        */

        ///////////////////////   Throws (we know this type of error can be thrown from here)   ////////////////
        /* */
            try{
                fun();
            }catch(Exception e){
                System.out.println(e.getMessage()+" Occured");
            }
        /* */

        }
    
        static void fun() throws ArithmeticException{
        // static void fun(){
            int a = 3;
            int b = 0;
    
            if (b/a == 0); 
                boolean isDanger = true;
            if (isDanger)
            {
                throw new ArithmeticException("Danger is coming...hence Stopping.!");
                // throw gives error & stops execution of program.
            }
        }
        
    
}