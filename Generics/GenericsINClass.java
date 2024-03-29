package Generics;

interface Run {
    public void run();
}

class Animal {

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class Monkey extends Animal implements Run {
    @Override
    public void run() {
        System.out.println("Monkey Can Run");   
    }
}

class Lion extends Animal implements Run{
    @Override
    public void run() {
        System.out.println("Lion Can Run");   
    }
}

class Cage<X extends Animal & Run> {
    private X animal1;
    private X animal2;

    public Cage() {
    }

    public Cage(X animal1, X animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public X getAnimal1() {
        return animal1;
    }

    public void setAnimal1(X animal1) {
        this.animal1 = animal1;
    }

    public X getAnimal2() {
        return animal2;
    }

    public void setAnimal2(X animal2) {
        this.animal2 = animal2;
    }

    // possible bz of upper bound with wildcard - Animal
    public boolean isSameBreed() {
        return animal1.getBreed().equals(animal2.getBreed());
    }

    // possible bz of upper bound with wildcard - Run
    public void runAnimal(){
        animal1.run();
        animal2.run();
    }

}

public class GenericsINClass {
    public static void main(String[] args) {

        Cage Cage = new Cage(); // Raw-type
        Cage.setAnimal1(new Monkey());
        Cage.setAnimal2(new Lion());

        // System.out.println(Cage.getAnimal1().getClass().getSimpleName()); // Monkey
        // System.out.println(Cage.getAnimal2().getClass().getSimpleName()); // Lion

        // ------------ ----- ------ ----- : Generics in Class : ---- ------ -------
        // ------ -----

        Cage<Monkey> monkeyCage = new Cage();
        monkeyCage.setAnimal1(new Monkey());
        // monkeyCage.setAnimal2(new Lion()); //Error
        monkeyCage.setAnimal2(new Monkey());

        // System.out.println(monkeyCage.getAnimal1().getClass().getSimpleName()); //
        // Monkey
        // System.out.println(monkeyCage.getAnimal2().getClass().getSimpleName()); //
        // Monkey

        // ------------ ----- ------ ----- : Generics with Constructors: ---- ------
        // ------- ------ -----

        // Cage<Lion> lionCage = new Cage(new Lion(),new Monkey());

        /*
         * Run-Time Error
         * 
         * By Compiler RHS is evaluated (without considering generic type) & assigned to
         * LHS => So no Compilation error
         */

        // Cage<Lion> lionCage = new Cage<Lion>(new Lion(),new Monkey()); // Compilation
        // Error
        Cage<Lion> lionCage = new Cage<Lion>(new Lion(), new Lion());

        // System.out.println(lionCage.getAnimal1().getClass().getSimpleName()); // Lion
        // System.out.println(lionCage.getAnimal2().getClass().getSimpleName()); // Lion

        // ------------- -------- --------- ------ WildCard with upper bound --------
        // -------- ---

        // Cage<String> strs = new Cage<String>();
        // Error - Bound mismatch: The type String is not a valid substitute for the
        // bounded parameter <X extends Animal> of the type Cage<X>
    }
}
