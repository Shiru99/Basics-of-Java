////////////////////////////////   Execution of JAVA program  ////////////////////////////////
//
//      1.  Static means it belongs to class but not with objects/instances (saves memory )
//          e.g. 
//              value of pie = 3.14
//      2.  applied to variables/methods/blocks/nested class
//
//      3.  static keyword cannot be declared static in a non-static inner type
//
//      4.  we can't declare a top-level class with static modifier, but nested class can be.
//
////////////////////////////////////////////////////////////////////////////////////////////////

package oops.staticDetails;

public class MainClass {

    static {
        System.out.println("1. it's running before main-method");
    }

    public static void main(String[] args) {
        System.out.println("3. In main Function");

        StaticVsInnerClass obj = new StaticVsInnerClass();
        StaticVsInnerClass obj2 = new StaticVsInnerClass();
        System.out.println(StaticVsInnerClass.temp + " - " + obj.temp + " - " + obj2.temp); // 9876 - 9876 - 9876
        obj.temp = 1234;
        System.out.println(StaticVsInnerClass.temp + " - " + obj.temp + " - " + obj2.temp); // 1234 - 1234 - 1234


        /* Inner Class */
        StaticVsInnerClass.InnerClass innerObj1 = obj.new InnerClass();
        StaticVsInnerClass.InnerClass innerObj2 = obj.new InnerClass();
        System.out.println(innerObj1.pie + " - " + innerObj2.pie); // 3.14159 - 3.14159
        innerObj2.pie = 3.14f;
        System.out.println(innerObj1.pie + " - " + innerObj2.pie); // 3.14159 - 3.14


        /* Static Inner Class */
        StaticVsInnerClass.StaticClass staticObj1 = new StaticVsInnerClass.StaticClass();
        StaticVsInnerClass.StaticClass staticObj2 = new StaticVsInnerClass.StaticClass();
        System.out.println(staticObj1.E + " - " + staticObj2.E); // 2.71828 - 2.71828
        staticObj1.E = 2.71f;
        System.out.println(staticObj1.E + " - " + staticObj2.E); // 2.71 - 2.71
        StaticVsInnerClass.StaticClass.E = 2.7f;
        System.out.println(staticObj1.E + " - " + staticObj2.E); // 2.7 - 2.7
    }

    static {
        System.out.println("2. it's running before main-method");
    }
}

class StaticVsInnerClass {

    static int temp = 0;

    static {
        temp = -9876;
    }

    // Inner Class
    public class InnerClass {
        float pie = 3.14159f;
    }

    // Static Inner Class
    static public class StaticClass {
        static float E = 2.71828f;
    }

    static {
        temp = 9876;
    }
}