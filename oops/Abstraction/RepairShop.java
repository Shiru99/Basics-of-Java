////////////////////////////////////   Abstraction  /////////////////////////////////////
//
//      A abstract class is declared with 'abstract' keyword
//          1.  it can have both abstract(method without body) as well as concrete(regular methods with body)
//          2.  only abstract class may have abstract methods not normal classes
//          3.  object can't be created for abstract class
//          4.  abstract class must be extended & abstract methods must be overridden 
//      
//
//////////////////////////////// Abstraction vs Encapsulation //////////////////////////////
//
//      Abstraction
//          1.  Abstraction is about hiding unwanted details while showing most essential info.
//          2.  abs allows focussing on what info object must contain
//          3.  abs solves issues at design level
//          4.  e.g. switching on button to turn on fridge instead of connecting three pin wires of fridge 
//              with electricity wires
//
//      Encapsulation
//          1.  Encapsulation means hiding internal details or mechanics of how an object does something
//              for security reasons
//          2.  Enc means binding the code and data into single unit
//          3.  Enc solves issues at implementation   
//          4.  e.g. keeping fridge in kitchen.
//
//
//////////////////////////////////////////////////////////////////////////////////////////////
package oops.Abstraction;

public class RepairShop{


    // without abstrction :

        public static void repairAudi(Audi a){
            System.out.println("Audi is repaired");
        }

        public static void repairBenz(Benz b){
            System.out.println("Benz is repaired");
        }

    // with abstraction :
            
        public static void repairCar(Cars c){
            System.out.println("Car is repaired");
        }

    public static void main(String[] args) {
        
        
        Audi a1 = new Audi();
        a1.accelerating();
        Benz b1 = new Benz();
        b1.breaking();

        // without abstraction :

            repairAudi(a1);      //  Audi is repaired
            repairBenz(b1);      //  Benz is repaired

                
        // with abstraction :

            repairCar(a1);      //  Car is repaired
            repairCar(b1);      //  Car is repaired

        // Cars c1 = new Cars();       // error      // object can't be created of abstract classes

        a1.Khatara();           //  your car is Khatara...

    }
    
}