class Gene<X,Y> 
{
    X a;
    Y b;

    public Gene(X x, Y y) {
        this.a = x;
        this.b = y;
    }

    public void description() {
        System.out.println( a.getClass().getName() + " - " + this.a + " & " +
                            b.getClass().getSimpleName() + " - " + this.b );
    }
}

public class Generic {
    
    public static void main(String[] args) 
    {
        // Gene<String,Integer> g1 = new Gene<String,Integer>("John Doe", 33);
        // Gene<Boolean,Double> g2 = new Gene<>(true, 3.14);

        // g1.description();
        // g2.description();

        Sum(2,4);
    }

    static <A,B> void Sum(A a,B b){
        System.out.println(a+","+b);
    }
}