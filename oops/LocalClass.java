package oops;

public class LocalClass {
    public static void main(String[] args) 
    {
        // Local Class
        class FooClass {
            private int x;

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
