/*
    LambdaExpressions :

        - provides a clear and concise way to represent one method interface using an expression

        - The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

        - Java lambda expression is treated as a function, so compiler does not create .class file

        - Enable to treat functionality as a method argument, or code as data.
        
        - A lambda expression can be passed around as if it was an object and executed on demand.
*/
@FunctionalInterface
interface Doo{
    public void doSomething(String task);
}
public class LambdaExpressions {
    public static void main(String[] args) 
    {
        Doo DooObj = (task)->System.out.println("Playing Game -"+task);

        DooObj.doSomething("Chess");
    }
}
