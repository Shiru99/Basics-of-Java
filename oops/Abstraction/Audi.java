package oops.Abstraction;

public class Audi extends Cars{

    public void accelerating(){
        System.out.println("Audi is accelerating.");
    }

    public void breaking(){
        System.out.println("Audi is Breaking.");
    }

    @Override                     // not necessary to mention  
    public void sold() {
        // TODO Auto-generated method stub

    }
    // all extract methods must be overrided in children.
    
}