package oops.staticDetails;

import oops.staticDetails.IntroStatic.InnerIntroStatic;
import oops.staticDetails.IntroStatic.InnerIntroStatic_1;

public class StaticCheck {
    public static void main(String[] args) {
        IntroStatic obj1 = new IntroStatic();

        // InnerIntroStatic obj2 = new InnerIntroStatic();   
        // non-static class can't accesses without creating object   
        InnerIntroStatic obj2 = obj1.new InnerIntroStatic(); 
        obj2.pie = 3; 
        System.out.println(obj2.pie);                           // 3.0

        InnerIntroStatic_1 obj3 = new InnerIntroStatic_1();
        obj2.pie = 3;
        System.out.println(obj3.pie);                           // 3.14
        System.out.println(InnerIntroStatic_1.pie);             // 3.14
        InnerIntroStatic_1.pie=3;
        System.out.println(InnerIntroStatic_1.pie);             // 3.0
    }
}