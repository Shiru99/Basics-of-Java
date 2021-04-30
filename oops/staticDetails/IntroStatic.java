/////////////////////////////////   Execution of JAVA program  ////////////////////////////////
//
//      1.  Static means it belongs to class but not with objects/instances   (saves memory )
//          e.g. 
//              value of pie = 3.14
//      2.  applied to variables/methods/blocks/nested class
//
//      3.  static keyword cannot be declared static in a non-static inner type
//
//      4.  we can't declare a top-level class with static modifier, but nested class can be.
//
///////////////////////////////////////////////////////////////////////////////////////////////////

package oops.staticDetails;

// public static class IntroStatic {                        // bz of point 4
public class IntroStatic {

    static{
        System.out.println("1. it's running before main-method");
        float pieee = 3.14444f;
        int fun = 0;
        //                          This runs before main method
    }

    public class InnerIntroStatic {
        // static float pie = 3.14f;                        // bz of point 3
        float pie = 3.14f;
    }

    static public class InnerIntroStatic_1 {
    
        static float pie = 3.14f;
    }

    public static void main(String[] args) {
        System.out.println("In main Function");
        float pyee = InnerIntroStatic_1.pie;           // no need to create object unlike non-static classes. 
        System.out.println(pyee);
    }

    static{
        System.out.println("2. it's running before main-method");
    }
}