// Package.name

/*
    How to Create Documentation : 

        $ javadoc  -use -splitindex -protected -author -version Documentation.java -d Documentation

*/


/**
 * This is Documentation Class. JavaDoc tool is a document generator tool in Java programming language for generating standard documentation in HTML format.
 * 
 * 
 * @version 1.0.0
 * @author shiru
 * 
 * @since 26th May 2021
 * 
 * @see  <a href="https://github.com/Shiru99/Basics-of-Java/blob/main/HelloWorld.java">HelloWorld</a>
 * @see  <a href="https://github.com/Shiru99/Basics-of-Java/blob/main/DateAndTime.java">DateAndTime</a>
 * @see  <a href="https://github.com/Shiru99/Basics-of-Java/blob/main/ExceptionHandling.java">ExceptionHandling</a>
 * @see  <a href="https://github.com/Shiru99/Basics-of-Java/tree/main/oops">OOPs</a>
 * 
 * 
 */

public class Documentation{

    /**
     * 
     * @param args These are arguments supplied to the command line
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        float a=3.0f;
        float b=6.0f;
        System.out.println("Addition of "+a+" & "+b+" is "+addition(a,b));
    }

    /**
     * private/protected methods - invisible on Documentation
     * @param i 1st integer argument for addition
     * @param j 2nd integer argument for addition
     * @return sum of two numbers as a integer
     * 
     * @deprecated this method is deprecated. better not to use
    */
    public static int addition(int i,int j){
        return i+j;
    }

     /**
     * public method - visible on Documentation 
     * @param i 1st float argument for addition
     * @param j 2nd float argument for addition
     * @return sum of two numbers as a float
     * @throws Exception if j equals to 0
    */
    public static float addition(float i,float j) throws Exception{
        if(j==0){
            throw new Exception();
        }
        return i+j;
    }
}