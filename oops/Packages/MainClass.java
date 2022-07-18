/////////////////////////////////   Access Modifier  ////////////////////////////////
//
//      1.  Private   :
//                      can be access only within the class
//      2.  Default   : 
//                      can be access only within the package
//                      it's default : no need to mention as well as no need to import
//                           

//                  Run like : 
//                              🃏~ :) javac oops/Packages/models/Teacher.java 
//                              🃏~ :) java oops.Packages.models.Teacher
//                                           
//      3.  Protected :
//                      can be access within the package & outside the package through child class 
//                      (inheritance)
//      4.  Public    :
//                      can be accessed from anywhere, just need to import
//
//
//
////////////// 
//
//              Create Packages : $ Javac -d . *.java 
//
///////////////////////////////////////////////////////////////////////////////////////////////////

package oops.Packages;

import oops.Packages.models.*;

public class MainClass {
    public static void main(String args[]) {

        Student stud1 = new Student("Rigveda");
        Teacher teach1 = new Teacher();
        CSEStudent cseStud1 = new CSEStudent("Ranchhoddas");

        // Access modifier from outside the package
        checkAccessModifiers(stud1);

        // Access modifier from outside the package through child class (inheritance)
        cseStud1.checkAccessModifiers();

        // Access modifier from inside the package
        teach1.checkAccessModifiers(stud1);

        // Access modifier from class
        stud1.checkAccessModifiers();
    }

    // Access modifier from outside the package
    public static void checkAccessModifiers(Student s) {
        // s.setName(s.getName());  // ERROR
        // s.sayGoodMorning();      // ERROR
        // s.getName();             // ERROR
        s.sayHello();
    }
}