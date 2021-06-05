package Generics;

import java.util.*;

class Gene<X,Y> 
{
    X a;
    Y b;

    public Gene(X x, Y y) {
        this.a = x;
        this.b = y;
    }

    public X getA() {
        return a;
    }

    public void setA(X a) {
        this.a = a;
    }

    public Y getB() {
        return b;
    }

    public void setB(Y b) {
        this.b = b;
    }

    public void description() {
        System.out.println( a.getClass().getName() + " - " + this.a + " & " +
                            b.getClass().getSimpleName() + " - " + this.b );
    }
}

public class Generic {
    
    public static void main(String[] args) 
    {
        Map<String,Date> a = new HashMap<>();
        // Gene<String,Integer> g1 = new Gene<String,Integer>("John Doe", 33);
        // Gene<Boolean,Double> g2 = new Gene<>(true, 3.14);

        // g1.description();
        // g2.description();

        Sum(2,4);
        Sum(2,3.3);
    }

    public static <A extends Number,B extends Number> void Sum(A a,B b){
        Number num = a.doubleValue()+ b.doubleValue();
        System.out.println("Sum of "+a+" & "+b+"\t= " +num);
    }
}