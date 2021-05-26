package oops;

public class Generic{

    public static void main(String[] args) {
        Gene<String,Integer> g1 = new Gene<String,Integer>("John Doe", 33);
        g1.description();
        Gene<Boolean,Double> g2 = new Gene<Boolean,Double>(true,3.14);
        g2.description();
    }
}

class Gene<X,Y>{

    X a; 
    Y b;

    public Gene(X x,Y y){
        this.a = x;
        this.b = y;
    }

    
    public void description(){
        System.out.println(a.getClass().getName()+" - "+this.a+" & "+b.getClass().getSimpleName()+" - "+this.b);
    }
    
}

/*
    a.getClass().getName()          ==> java.lang.String 
    a.getClass().getSimpleName()    ==> String

*/