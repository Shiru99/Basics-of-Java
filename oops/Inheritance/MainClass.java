
/////////////////////////////////   Inheritance  ////////////////////////////////
//
//      1.  for child only one class can be parent.
//      2.  super adds parent's method in children.
//
//      3.  constructor of parent is always called regardless of however constructor in child, from child's 
//          constructor
//          super(arguments) ==> calls parent construtor with arguments
//          otherwise        ==> calls parent construtor without arguments i.e. super()    
//
//      4.  So, if construtor with arguments is added in parent we need to add construtor with arguments in 
//          childern also to use child with arguments & add super(arguments)
//          and
//          need to add construtor without arguments in parents to use child without arguments
//         
//
///////////////////////////////////////////////////////////////////////////////////////////////////

package oops.Inheritance;

public class MainClass {
      
    public static void main(String[] args) {

        System.out.println("Person P :");
        Person p = new Person();
        /*  
                person - Constructor without arguments
        */
        System.out.println("Teacher t :");
        Teacher t = new Teacher();
        /*  
            Due to Super & Constructor :
                    person - Constructor without arguments
                    In Teacher construtor without arguments
        */
        t.name = "RanChhodDas";
        System.out.println("Singer s :");
        Singer s = new Singer();
        /*  
                    person - Constructor without arguments
        */
        s.name = "Virus";

        s.eat();
        s.eat("Vadapav");
        /*      
            Due to Super :
                    person 'Virus' can walk.
                    Singer 'Virus' is eatting Vadapav
        */

        t.eat();
        /*  
            Due to Super :
                    person 'RanChhodDas' can walk.
                    person 'RanChhodDas' can eat.
                    Teacher 'RanChhodDas' can eat.
        */



        /////////////////////////////////   Upcasting   ////////////////////////////////

        Person p1 = t;                  // upcasting 
        System.out.println(p1.name);
        // p1.teach();                  // ERROR


        /////////////////////////////////   Downcasting    ////////////////////////////////

        // Teacher t1 = (Teacher) p;    // ERROR : class models.Person cannot be cast to class models.Teacher
        Teacher t1 = (Teacher) p1;                // Downcasting correct bz p is upcasted from teacher only
        t1.teach();
        System.out.println(t1.name);

        System.out.println(t instanceof Teacher);           // true
        System.out.println(t instanceof Person);            // true
        System.out.println(p1 instanceof Teacher);          // true
        System.out.println(p1 instanceof Person);           // true
        System.out.println(t1 instanceof Teacher);          // true
        System.out.println(t1 instanceof Person);           // true



        /////////////////////////////////   Construtor with arguments    ////////////////////////////////
        System.out.println("Person P0 :");
        Person p0 = new Person("John Doe");

        System.out.println("Teacher t0 :");
        Teacher t0 = new Teacher("Jenny Doe"); 
        /*
            if super(arguments) is not called,
                person - Constructor without arguments (must be defined otherwise ERROR)
                In Teacher construtor with arguments
            otherwise,
                person - Constructor with arguments depending on super() or super(arguments    )
                In Teacher construtor with arguments
        */

    }
}