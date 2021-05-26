// Package.name


// How to Create doc : javadoc -d doc -author -version Documentation.java

/**
 * JavaDoc tool is a document generator tool in Java programming language for generating standard documentation in HTML format.
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

    private static void addition(int a,int b){
        System.out.println("Addition of "+a+" & "+b+" is "+(a+b));
    }

    public static void main(String[] args)
    {
        addition(3, 6);
    }
}