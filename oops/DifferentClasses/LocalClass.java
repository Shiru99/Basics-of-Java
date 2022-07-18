package oops.DifferentClasses;

public class LocalClass {
    public static void main(String[] args) 
    {

        int alpha = -1;

        // alpha = 99;      
        /* 
            Local variable alpha defined in an enclosing scope must be final or effectively final
        */ 


        // Local Class
        class FooClass {
            private int x;
            private int y = alpha; 

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }

        }

        FooClass foo = new FooClass();
        foo.setX(99);
        System.out.println(foo.getX());

    }
}
