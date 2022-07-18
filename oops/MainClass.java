package oops;

public class MainClass { // ONLY ONE public class

    public static void main(String args[]) {
        Dog husky = new Dog();

        husky.describe();
        husky.isDanger = true;
        husky.color = "Black & White";
        husky.breed = "Husky";
        husky.describe();
    }
}

class Dog {

    boolean isDanger; // by Default false
    String color, breed; // by Default null

    public void describe() {
        System.out.println("Dog color is " + color + " & breed is " + breed + ". is it Danger? " + isDanger);
    }
}

/////////////////////////////////////////////    (: The End :)    ////////////////////////////////////////////