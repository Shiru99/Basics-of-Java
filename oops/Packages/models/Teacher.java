
package oops.Packages.models;

public class Teacher {
    
    // Access modifier from package
    public void checkAccessModifiers(Student s){
        // s.setName(s.getName());  // ERROR
        s.sayGoodMorning();
        s.getName();
        s.sayHello();
    }
}