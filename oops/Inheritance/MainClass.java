
/////////////////////////////////   Inheritance  ////////////////////////////////
//
//      1.  for child only one class can be parent.
//      2.  super adds parent's method in children.
//
//      3.  constructor of parent is always called regardless of however constructor in child, from child's 
//          constructor
//          super(arguments) ==> calls parent constructor with arguments
//          otherwise        ==> calls parent constructor without arguments i.e. super()    
//
//      4.  So, if constructor with arguments is added in parent we need to add constructor with arguments in 
//          children also to use child with arguments & add super(arguments)
//          and
//          need to add constructor without arguments in parents to use child without arguments
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
        System.out.println("Person age (String) - "+p.age);


        System.out.println("Teacher t :");
        Teacher t = new Teacher();
        /*  
            Due to Super & Constructor :
                    person - Constructor without arguments
                    In Teacher constructor without arguments
        */
        t.name = "RanChhodDas";
        System.out.println("Teacher - age : "+t.age);


        System.out.println("Singer s :");
        Singer s = new Singer();
        /*  
                    person - Constructor without arguments
        */
        s.name = "Virus";
        System.out.println("Singer - age : "+t.age);

        s.eat();
        s.eat("Vadapav");
        /*      
            Due to Super :
                    person 'Virus' can walk.
                    Singer 'Virus' is eating Vadapav
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



        /////////////////////////////////   Constructor with arguments    ////////////////////////////////
        System.out.println("Person P0 :");
        Person p0 = new Person("John Doe");

        System.out.println("Teacher t0 :");
        Teacher t0 = new Teacher("Jenny Doe"); 
        /*
            if super(arguments) is not called,
                person - Constructor without arguments (must be defined otherwise ERROR)
                In Teacher constructor with arguments
            otherwise,
                person - Constructor with arguments depending on super() or super(arguments    )
                In Teacher constructor with arguments
        */

    }
}