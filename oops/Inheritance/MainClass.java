
/////////////////////////////////   Inheritance  ////////////////////////////////
//
//      1.  for child only one class can be parent.
//      2.  super adds parent's method in children.
//
//      3.  constructor of parent is always called, regardless of struct. of constructor in child
// 
//          super(arguments) ==> calls parent constructor with arguments
//          otherwise        ==> calls parent constructor without arguments i.e. super()    
//
//      4.  If there is only constructor with arguments in parent we need to call super(arguments) from child,
//          otherwise default super() call gives error
//         
//
///////////////////////////////////////////////////////////////////////////////////////////////////

package oops.Inheritance;

public class MainClass {
      
    public static void main(String[] args) {

        System.out.println("\nPerson P :");
        Person p = new Person();        // Person-constructor without arguments
        // System.out.println("Person age (String) - "+p.age);         // Person age (String) - Null-String


        System.out.println("\nTeacher t :");
        Teacher t = new Teacher();  // Person-constructor without arguments + Teacher-constructor without arguments
        t.name = "Virus";
        // System.out.println("Teacher - age : "+t.age);           // Teacher - age : 99


        System.out.println("\nSinger s :");
        Singer s = new Singer();    // Person-constructor without arguments
        s.name = "Singer";
        // System.out.println("Singer - age : "+t.age);                // Singer - age : 99

        System.out.println();
        p.eat();    // person 'Null-String' can eat.
        s.eat();    // person 'Singer' can eat.
        t.eat();    // person 'Virus' can walk. +  person 'Virus' can eat. + Teacher 'Virus' can eat.
        s.eat("Vadapav");   // person 'Singer' can walk. + Singer 'Singer' is eating Vadapav



        /////////////////////////////////   Upcasting   ////////////////////////////////

        System.out.println("\nUpcasting :");
        Person p1 = t;
        // System.out.println(p1.name);    // Virus
        // p1.teach();      // ERROR
        p1.eat();           // person 'Virus' can walk. + person 'Virus' can eat. + Teacher 'Virus' can eat.
        



        /////////////////////////////////   Downcasting    ////////////////////////////////

        System.out.println("\nDowncasting :");
        // Teacher t1 = (Teacher) p;    // ERROR : class models.Person cannot be cast to class models.Teacher
        Teacher t1 = (Teacher) p1;      /* Downcasting correct bz p is upcasted from teacher only */ 
        // System.out.println(t1.name);    // Virus
        p1.eat();                       // person 'Virus' can walk. + person 'Virus' can eat. + Teacher 'Virus' can eat.
        t1.teach();                     // Teacher 'Virus' can teach.
        

        // System.out.println(p1 instanceof Teacher);          // true
        // System.out.println(p1 instanceof Person);           // true
        // System.out.println(p1 instanceof Singer);           // false

        // System.out.println(t instanceof Teacher);           // true
        // System.out.println(t instanceof Person);            // true

        // System.out.println(t1 instanceof Teacher);          // true
        // System.out.println(t1 instanceof Person);           // true



        /////////////////////////////////   Constructor with arguments    ////////////////////////////////

        System.out.println("\nConstructor with arguments :");
        System.out.println("Person P0 :");
        Person p0 = new Person("John Doe");

        System.out.println("Teacher t0 :");
        Teacher t0 = new Teacher("Jenny Doe"); 
        /*
            if super(arguments) is not called,
                Person-constructor without arguments (must be defined otherwise ERROR)
                Teacher-constructor with arguments
            otherwise,
                Person-constructor with arguments depending on super() or super(arguments    )
                Teacher-constructor with arguments
        */

    }
}