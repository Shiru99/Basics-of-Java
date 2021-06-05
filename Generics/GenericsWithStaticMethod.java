package Generics;

public class GenericsWithStaticMethod {
    public static void main(String[] args) {
        Sum(2, 4);
        Sum(2, 3.3);
    }

    public static <A extends Number, B extends Number> void Sum(A a, B b) {
        Number num = a.doubleValue() + b.doubleValue();
        System.out.println("Sum of " + a + " & " + b + "\t= " + num);
    }
}
