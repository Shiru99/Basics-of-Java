//////////////////////////////// Final Keyword //////////////////////////////
//
//      Variable :
//              1.  final variable can't be changed.
//              2.  final variables must be initilized while 'creating' only (not for local variables, local 
//                  variables can be initialized later)
//              3.  once created variable can't be converted into final
//              4.  final variables should be in CAPITALS (convention)
//              5.  BLACK variable - final variable that is not initilized while declaration
//                      these can be intilized in blocks or static blocks or constructors
//          
//      method :
//              final method can't be overridden.
//          
//      class :
//              final class can't be extended i.e no children.
//          
//
//
//
//////////////////////////////////////////////////////////////////////////////////////////////

package oops.FinalKeyword;

public class MainClass {

    // final String FUN; 
    // Error : final variables must be initilized while 'creating' only (not for local variables)
    final String FUN = "Fun";

    public static void main(String[] args)
    {
        
        //////////////////////////////////   VARIABLE     //////////////////////////////
        
        // String name = "John Doe";
        // name = "Jenny Doe";              // creates new string and 'name' variable will point this new String

        // final String NAME = "Jerry..!!!";   
        // name = "John";                       // Error


        // final String COLLEGE;            // COLLLEGE - Blank variable
        // System.out.println(COLLEGE);     // ERROR : The local variable COLLEGE may not have been initialized
        // COLLEGE = "HARIHARIDHAR";
        // System.out.println(COLLEGE);     // HARIHARIDHAR



        Student s1 = new Student();
        System.out.println(s1.NAME);
        System.out.println(s1.ROLL_NUMBER);

        Student s2 = new Student("Dheridhar");
        System.out.println(s2.NAME);
        System.out.println(s2.ROLL_NUMBER);
        // s2.ROLL_NUMBER , s2.marks = 1,99 ;                        // ERROR 
        

        //////////////////////////////////   Object     //////////////////////////////

        final Student s3 = new Student();
        // s3 = s2;                         // error: cannot assign a value to final variable s3
        System.out.println(s3.marks);
        s3.marks = 99;
        System.out.println(s3.marks);
        // referance "s3" can be fixed but variable in it are not.
    }

}

