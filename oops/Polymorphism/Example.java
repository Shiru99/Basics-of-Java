package oops.Polymorphism;

class AClass {
    public void fun() {
        System.out.println("A");
    }
}

class BClass extends AClass {
    public void fun() {
        System.out.println("B");
    }
}

class CClass extends BClass {
    public void fun() {
        System.out.println("C");
    }
}

public class Example {
    public static void main(String[] args) {
        AClass temp1 = new CClass();
        temp1.fun();
        System.out.println(temp1.getClass().getSimpleName());

        BClass temp2 = (BClass) temp1;
        temp2.fun();
        System.out.println(temp2.getClass().getSimpleName());
    }
}