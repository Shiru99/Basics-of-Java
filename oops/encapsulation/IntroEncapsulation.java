/////////////////////////////////   why encapsulation  ////////////////////////////////
//
//      1.  Keeps related fields & methods together cleanly
//
//      2.  helps to control modification of our data fields
//
//      3.  helps to decouple components of system , these decoupled components can be developed/tested
//          /debugged independently & concurrently. and any changes in particular component do not have 
//          effect on other components
//
//
//      Encapsulation refers to the bundling of related fields & methods together. this allows us to achieve 
//      data hiding. Encapsulation in itself is not data hiding
//
//
///////////////////////////////////////////////////////////////////////////////////////////////////


package oops.encapsulation;

public class IntroEncapsulation {

    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.name = "Ranchhoddas";

        System.out.println(stud1.name);

        stud1.setEnroll(100);                             // You haven't paid completely.!
        System.out.println(stud1.getPaidAmount());        // 100

        stud1.setEnroll(100);                             // You haven't paid completely.!
        System.out.println(stud1.getPaidAmount()); 
    }
}