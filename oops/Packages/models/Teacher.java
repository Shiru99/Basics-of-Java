
package oops.Packages.models;

public class Teacher {
    
    String name;
    public Teacher(final String name){
        this.name = name;
        System.out.println("Teacher object with name - "+this.name+" has been created Successfully.");
    }

    public static void main(String args[]){

        Student stud1 = new Student("RanChodDas");
        System.out.println(stud1.getName());           // RanChodDas

    }
}