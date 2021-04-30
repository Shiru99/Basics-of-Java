package oops;

public class MainClass {               // ONLY ONE public class
     
    public static void main(String args[])
    {
        Dog huskey = new Dog();
        huskey.des();
        huskey.isDanger = true;
        huskey.color="Black & White";
        huskey.breed="Huskey";

        huskey.des();

        
    }  
}

class Dog{

    boolean isDanger;             // by Default false
    String color , breed;         // by Default null

    public void des(){
        System.out.println("Dog color is "+color+" & breed is "+breed+". is it Danger? "+isDanger);
    }
}
/////////////////////////////////////////////    :) The End :)    ////////////////////////////////////////////