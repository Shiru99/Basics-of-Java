package oops.FinalKeyword;

public final class CseStudent extends Student {
    
    // public void Description(){
    //     System.out.println("My name is "+NAME+". I am CSE Student & roll number : "+ROLL_NUMBER);
    // }

    // ERROR final methods can't be overridden in children

    public void fun(){
        System.out.println("Having NO fun :( ");
    }

}