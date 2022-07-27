package ReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class MainClass {
    public static void main(String[] args) {
        
        /* Get Class instance */
        // M-1 from object
        Class<?> class1 = "Hello".getClass();
        System.out.println(class1);     // class java.lang.String

        // M-2 from known class
        Class<?> class2 = String.class;
        System.out.println(class2); // class java.lang.String

        // M-3 from name of class
        try {
            Class<?> class3 = Class.forName("java.lang.String");
            System.out.println(class3); // class java.lang.String
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Class<?> supClass = SmartPhone.class.getSuperclass();
        System.out.println(supClass); // class ReflectionAPI.Phone
        
        Class<?>[] interfaces = SmartPhone.class.getInterfaces();
        for (Class<?> class3 : interfaces) {
            System.out.println(class3); // [class ReflectionAPI.Camera, class ReflectionAPI.GPS]
        }




        /*  Get Class fields */
        Class<?> clss = iPhoneX.class;

        // M-1 : by field name
        try {
            Field field = clss.getField("brand");   // for public field
            System.out.println(field); // public java.lang.String ReflectionAPI.iPhoneX.brand
        } catch (NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }

        // M-2 : getDeclaredFields
        Field[] fields = clss.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field+", ");
        }


        // M-3 : getFields - only for public field
        Field[] fields2 = clss.getFields();
        for (Field field : fields2) {
            System.out.println(field+", ");
        }


        /*  Get Class Methods */

        // M-1 : getMethods
        try {
            Method method = clss.getMethod("isAvailable");  // only for public method
            System.out.println(method); // public boolean ReflectionAPI.iPhoneX.isAvailable()
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }

        // M-2 : getDeclaredMethods (NO parent class methods)
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods) {
            // System.out.println(method+", ");
        }
        System.out.println();

        // M-3 : getMethods - only for public method (also parent class methods)
        Method[] methods2 = clss.getMethods();
        for (Method method : methods2) {
            // System.out.println(method+", ");
        }
        System.out.println();



        /* Get Class Constructors */
        
        // M-1 : getConstructor - only for public constructor
        try {
            Constructor<?> constructor = clss.getConstructor( String.class);
            System.out.println(constructor); // public ReflectionAPI.iPhoneX()
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }

        // M-2 : getDeclaredConstructors
        Constructor<?>[] constructors = clss.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println();

        // M-3 : getConstructors - only for public constructor
        Constructor<?>[] constructors2 = clss.getConstructors();
        for (Constructor<?> constructor : constructors2) {
            System.out.println(constructor);
        }
        System.out.println();


        /* Get Modifiers */

        // M-1 : getModifiers
        try {
            Field field = clss.getField("brand");
            System.out.println(Modifier.isPublic(field.getModifiers())); // true
        } catch (NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
