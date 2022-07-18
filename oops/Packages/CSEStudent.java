package oops.Packages;

import oops.Packages.models.Student;

public class CSEStudent extends Student {
    
    public CSEStudent(String name){
        super(name);
    }

    // Access modifier from child (outside the package)
    public void checkAccessModifiers(){
        // super.setName(this.getName());   // Error
        // super.sayGoodMorning();          // Error
        super.getName();
        super.sayHello();
    }
}