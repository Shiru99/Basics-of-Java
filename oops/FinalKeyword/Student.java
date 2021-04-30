package oops.FinalKeyword;

public class Student {
    
    final int ROLL_NUMBER;
    final String NAME;
    int marks;

    {
        ROLL_NUMBER = 0;
        marks = 0;
    }

    public Student(){        // error: cannot assign a value to final variable NAME
        NAME = "NA";
    }

    public Student(String s){
        NAME = s;
    }

    public void Description(){
        System.out.println("My name is "+ NAME +" & roll number : "+ ROLL_NUMBER);
    }

}