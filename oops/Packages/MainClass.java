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

// import oops.Packages.models.Student;
// import oops.Packages.models.Teacher;

import oops.Packages.models.*;

public class MainClass {
    public static void main(String args[]){

        boolean isEntered = true;
        
        Student stud1 = new Student("Rugved"); 
        // Student object with name - Rugved has been created Successfully.
        Teacher tech1 = new Teacher("Atharv"); 
        //  Teacher object with name - Atharv has been created Successfully.


        // Similarly Scanner class works
        
    }
}