package Generics;

class Monkey {}
class Lion{}

class Cage <X> {
    private X animal1;
    private X animal2;

    public Cage() {}
    
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
}

public class GenericsINClass {
    public static void main(String[] args) {

        Cage Cage = new Cage();         // Raw-type 
        Cage.setAnimal1(new Monkey());
        Cage.setAnimal2(new Lion()); 

        // System.out.println(Cage.getAnimal1().getClass().getSimpleName());    // Monkey
        // System.out.println(Cage.getAnimal2().getClass().getSimpleName());    // Lion




        // ------------ ----- ------ ----- : Generics in Class :  ---- ------ ------- ------ -----


        Cage<Monkey> monkeyCage = new Cage();
        monkeyCage.setAnimal1(new Monkey());
        // monkeyCage.setAnimal2(new Lion());   //Error
        monkeyCage.setAnimal2(new Monkey());

        // System.out.println(monkeyCage.getAnimal1().getClass().getSimpleName());    // Monkey
        // System.out.println(monkeyCage.getAnimal2().getClass().getSimpleName());    // Monkey




        // ------------ ----- ------ ----- : Generics with Constructors:  ---- ------ ------- ------ -----


        // Cage<Lion> lionCage = new Cage(new Lion(),new Monkey());   

        /* 
            Run-Time Error
            
                By Compiler RHS is evaluated (without considering generic type) & assigned to LHS => So no Compilation error
        */

        // Cage<Lion> lionCage = new Cage<Lion>(new Lion(),new Monkey());   // Compilation Error
        Cage<Lion> lionCage = new Cage<Lion>(new Lion(),new Lion());

        // System.out.println(lionCage.getAnimal1().getClass().getSimpleName());    // Lion
        // System.out.println(lionCage.getAnimal2().getClass().getSimpleName());    // Lion


    }
}
