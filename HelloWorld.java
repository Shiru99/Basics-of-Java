import java.util.Scanner;
import java.util.Arrays;

class HelloWorld
{                                                    // class name always starts with capital alpha.
    public static void main(final String args[])           // methods always starts with small alpha. 
    {        
        System.out.println("--------------------------------------------------------\n"); 

        System.out.println("Hello World ...!!!!");  
        // System.out.print('Hello.!!!');             // println adds new line at the end
        // System.out.println();      // gives next line(enter as output)    Note: sysout+enter (shortcut)


////////////////////////////////////    VARIABLES (Primitive Datatypes)       ////////////////////////////////

        //     /*

        //     Integer Type   :  
        //     /                    byte(10)             ==> 1 byte = 1 bit for sign + 7 bits for storage
        //     /                    short(10101)         ==> 2 bytes
        //     /                    int(1010101)         ==> 4 bytes
        //     /                    long(101010101010)   ==> 8 bytes

        //     Decimal Type    :  
        //     /                    float(12.345)
        //     /                    double(1.23456)

        //     Character Type  :    char('I')

        //     Boolean Type    :    true/false

        //     */

        // int day = 1;                          // variables start with small alpha.
        // float time = 15.13f;                  // float ends with 'f'
        // double time0 = 15.1432;               // no need of f
        // boolean willIFinishItToday = true;    
        // char myFavChar = '@';                 // char always in single quotes - ''

        // int count = 0b00010;                 // 2
        // int price = 9_999;                   // 9999
        // double val = 23_456.789E-12;         // 2.3456789E-8  

        // var v1 = 0;
        // var v2 = 0.1f;
        // var v3 = 'a';
        // var v4 = "String";
        // var v5[] = {2,2,2}; // ERROR



//////////////////////////////////////////    TYPECASTING        /////////////////////////////////////

        // /*

        //     Automatic Type Casting :

        //     byte -> short -> char -> int -> long -> float -> double

        //     // NOTE :- short -> char

        // */

        // short num = 72;
        // System.out.println(num);

        // int num0 = num;
        // System.out.println(num0);


        // /*

        //     Manual Type Casting : 

        //     byte <- short <- char <- int <- long <- float <- double

        //     char   -> String                 //  String = Character.toString(char)
        //     String -> char                   //  char = String.charAt(i);

        // */

        // double myDouble = 2.999999;
        // int myInt = (int) myDouble;
        // System.out.println(myInt);                // gives 2 - floor value, not 3



        // /*

        //   <->  char <-> 

        // */


        // char ch = (char) num;                // 65-A...(Ascii)        
        // System.out.println(ch);              // H
        
        // int wow = 1199;
        // char $Wow = (char) wow;
        // System.out.println($Wow);            // Y

        // char ch = 2;                          
        // System.out.println(ch);                 // ==> "\n"


        // int ascII = 'a';                           // ASCII value - 97
        // System.out.println(ascII);

/////////////////////////////////////////////////    SCANNER    //////////////////////////////////////////


        // /*

        //     import java.util.Scanner;    // add this to top of the program

        // */


        // Scanner scanning = new Scanner(System.in);         // 99.99
        // double x = scanning.nextDouble();
        // System.out.println(x);                             // 99.99
 
        // Scanner scanning0 = new Scanner(System.in);        // byeee
        // String y = scanning0.nextLine();
        // System.out.println(y);                             // byeee







        // // Scanner scanning1 = new Scanner(System.in);          // "22.22 How Are You ? I am fine."

        // // double num = scanning1.nextDouble();
        // // String str = scanning1.nextLine();
        // // System.out.println(num);                             //   22.22        
        // // System.out.println(str);                             // " How Are You ? I am fine."

        





        // Scanner sc = new Scanner(System.in);

        // int principal = sc.nextInt();
        // float rate = sc.nextFloat();
        // int time = sc.nextInt();

        // float interest = principal*rate*time/100;

        // System.out.println("Simple interest is : "+interest);
        // /*
        //     100000
        //     12.5
        //     4
        //     Simple interest is : 50000.0
        // */

/////////////////////////////////////////////////    Operations    //////////////////////////////////////////


        // /*
        //     Arithmetic operators : & , |
        // */

        // int x = 33;
        // float y = 45.1f;
        
        // int sq = (x+y)*(x+y);
        // int s = y/x;         // ERROR - if one of them is of float/double type ==> typecast & then use
        // double s = y/x;              // y/x gives integer unless one of them is of float/double type
        // System.out.println(s);       // 1 ==> 1.0
        // //                           // result of typecast double 1 ==> 1.0  

        // int reminder = y%x;

        // int earlyIncr = ++x;        // before execution 
        // int lateIncr  = x++;        // after execution 

        // /*
        //     bitwise operators : & , |
            
        //     4 & 6    ==> 0100 & 1010 = 0000 ==> 0
        //     4 | 6    ==> 0100 | 1010 = 1110 ==> 14

        //     odd & 1  ==> ...1 & .001 = 0.01 ==> 1                 //  System.out.println(13&1); ==> 1
        //     even & 1 ==> ...0 & .001 = 0.00 ==> 0                 //  System.out.println(14&1); ==> 0

        // int num = 9;
        // if((num & 1) == 1){
        //     System.out.println("Odd");
        // }

        //     bitwise operators : >> (right-shift) , << left-shift
        //     4>>2 ==> 0100 -> 0010 -> 0001 ==> 1                   //  Simply divide by 2
        //     4<<2 ==> 0100 -> 1000 -> 1 0000 ==> 16                //  Simply multiply by 2

        //     System.out.println(4<<2);             // 16



        //     Assignment operators : = , += , -= , *= , /= , %=
            
        //     x += 1 ;                              // x = x + 1   ==> 34
        //     x |= 3 ;                              // x = x | 3   ==> 35
        //     x <<=2 ;                              // x = x <<2   ==> 132

        // */


        // /*
        //     comparison operators : > , < ,== , != , >= , <=
            
        //     x > 1 ;        // true
        //     x == x;        // true

        // */

        // /*
        //     Logical operators : && , || , ! , ^       // ^ - XOR
            
        //     true && true        ==> true
        //     false && true       ==> false
        //     false || true       ==> true
        //     ! false             ==> true
        //     true ^ true         ==> false
        //     false ^ true        ==> true
        //     false ^ false       ==> false




        //     difference between & and && is :

        //     0 && 1 && 1 && 1 && 1 && 1 && 1 && 1 && 1 && 1  // Gives 0/false just locking at 1st 0
        //     0 & 1 & 1 & 1 & 1 & 1 & 1 & 1 & 1               // Gives 0/false only after checking till end


        // */

///////////////////////////////////////    Conditional Statements    //////////////////////////////////////////


        // /*

        //     if-elseif-else :

        // */

        // int num = 33;

        // if(num==44)
        // {
        //     System.out.print("num is 44");
        // }
        // else if (num == 55) System.out.print("num is 55");       // for single line no need of {}
        // else
        // {
        //     System.out.print("num is neither 44 nor 55 "); 
        // }

        
        // /*

        //     nested if else:

        // */


        // if(num>44)
        // {
        //     if (num<55) 
        //     {
        //         System.out.print("num is greater 44 but less than 55");
        //     }
        //     else  
        //     {
        //         System.out.print("num is greater 55");
        //     }
        // }
        // else
        // {
        //     System.out.print("num is less than 44 "); 
        // }

        // /*

        //     ternary Operator    (condition) ? (result of true) : (result of false)

        // */

        // int a =11;
        // int b =22;
        // int c =33;
        // int maxOfAB = a>b ?  a : b ;
        // int maxOfABC = a>b?(a>c?a:c):(b>c?b:c);


        // /*

        //     Switch 

        // */

        // char ch0 ='#';

        // switch (ch0) 
        // {
        //     case 'a':
        //         System.out.println("it's 'a'");
        //         break;
        //     case '@':
        //         System.out.println("it's '@'");
        //         break;
        //     case '#':
        //     case '$':
        //         System.out.println("it may be '#' or '$'");
        //     default:
        //         System.out.println("it's neither 'a' nor '@'");
        // }


//////////////////////////////////////////////    Loops    /////////////////////////////////////////////


        // /*

        //     For loop :

        //     for (initialization;condition;re-initialization)
        //     {
        //         // initialization executes only once                ==> can  be empty => infinite loop
        //         // condition executes every time before code block
        //         // re-initialization executes every-time but at the end of code block
        //     }

        // int i,j;
        // for(i=1,j=49;i+j<100;i+=2,j--){
        // System.out.print("("+i+","+j+")\t");
        // }



        //     nested for loop :

        //     for (){
        //             for(){
        //                     for(){ 
        //                             for(){}
        //                     }
        //             }
        //     }
        // */

        // /*
        
        //     BREAK     ==> exits completely from current loop

        //     CONTINUE  ==> skips current executing loop and moves to next loop
        
        // */

        // /*

        //     While loop :

        //     initialization
            
        //     while(condition)
        //     {
        //         // code

        //         re-initialization
        //     }

        // */


        // /*

        //     do While loop :

        //     initialization

        //     do
        //     {
        //         // code

        //         //re-initialization

        //     }while(condition)

        // */

        
//////////////////////////////////////////////   Array    /////////////////////////////////////////////


        // /*

        //     int [] nums;
        //     nums = new datatype[n]

        //     OR

        //     int[] nums = new datatype[n]
        // */
        
        // int nums[] = {9,3,7,0};

        // for (int a : nums){                     //// FOREACH LOOP
        //     System.out.println(a);
        // }

        // int nums[] = {9,3,7,0};
        // String nums[] = {"A","B","CD"};
        // for (var v : nums) {
        //         System.out.print(v+" ");
        // }


        // int num[][]={
        //     {1,2,3,5,6,8,9,6},
        //     {1,2,3,4,5},
        //     {3,5},
        //     {0}
        // };

        // System.out.println(num[3][0]);
        // System.out.println(num);               ////// Some ABSTRACT

        // for(int[]A:num){                       //// FOREACH LOOP
        //     for(int a:A){
        //         System.out.println(a);
        //     }
        // }

        // System.out.println(num);                                // [[I@6ff3c5b5
        // System.out.println(Arrays.deepToString(num));           
        // [
        //      [1, 2, 3, 5, 6, 8, 9, 6],
        //      [1, 2, 3, 4, 5],
        //      [3, 5],
        //      [0]
        // ]

//////////////////////////////////////////////    Strings    /////////////////////////////////////////////


        // /*
            
        //     * Strings always in ""
        //     * char always in ''

        //     String animal1 = new String("Dog")

        //     /// creates string in both pool area(if it's not available) & Heap area(always) as well.

        //     String animal2 = "cat"
        //     /// creates in only pool area if not available

        //     string animal3 = "cat"
        //     /// uses same available in pool ; doesn't create new one // more efficient way of JAVA
        // */


        //     ////////////////////////////////////////////////////////////////////////////////////////////
        //     //                                                                                        //
        //     //                                                                                        //
        //     //              ///////////////// STRING POOL AREA //////////////
        //     //              //                                             //
        //     //              //                "DOG"                        //
        //     //              //                                             //
        //     //              //                "CAT"                        //
        //     //              //                                             //
        //     //              /////////////////////////////////////////////////
        //     //                                                                                        //
        //     //                                                                                        //
        //     //                         "DOG"        HEAP AREA                                         // 
        //     //                                                                                        //
        //     //                                                                                        //
        //     ////////////////////////////////////////////////////////////////////////////////////////////


        // String name1 = "John Doe";
        // String name2 = "John Doe";
        // String name0 = new String("John Doe");


        //     // "==" matches string as well as location/pointer
        //     System.out.println(name1 == name2 );              //    true
        //     System.out.println(name1 == name0 );              //    false

        //     // "equals" matches string
        //     System.out.println(name1.equals(name2) );         //    true
        //     System.out.println(name1.equals(name0) );         //    true

        //      // "compareTo" matches string
        //      System.out.println(name1.compareTo(name2));      //      0
        //      System.out.println(name1.compareTo(name0));      //      0


        //     // STRINGS ARE IMMUTABLE // string can't be modified once declared

        //     String name = "John Doe";
        //     name = "Jenny Doe";         // creates new string and 'name' variable will point this new String
        //     System.out.println(name);   // Jenny Doe



//////////////////////////////////////////////    String Functions     ///////////////////////////////////////


        // /*

        //     Automatic Type Casting :
        //     byte -> short -> char -> int -> long -> float -> double

        //     Manual Type Casting : 
        //     char   -> String                 //  String = Character.toString(char)
        //     String -> char                   //  char = String.charAt(i);

        // */

        // final String city = "Tokyo";

        // System.out.println(city.charAt(0));                              // T
        // System.out.println(city.length());                               // 5
        // System.out.println(city.substring(1));                           // okyo
        // System.out.println(city.substring(1,3));                         // ok


        // System.out.println(city.contains("to"));                         // false
        // System.out.println(city.contains('T'));                          // ERROR (No Char)
        // System.out.println(city.contains((String)'T'));                  // ERROR
        // System.out.println(city.contains(Character.toString('T')));      // true


        // System.out.println(city.equals("tokyo"));       // false
        // System.out.println(city.isEmpty());             // false
        // System.out.println(city.concat(" to Paris"));   // Tokyo to Paris
        // String peri = city+" to bali";
        // System.out.println(peri);                       // Tokyo to bali

        
        String city = "abcAbcabcAbc";
        // System.out.println(city.replace('a','Z'));      // ZbcAbcZbcAbc
        String fun[] = city.split("a");
        for (String s : fun) {
            System.out.println(s);              //  empty , bcAbc , bcAbc
        }



        // city = "Tokyo";
        // System.out.println(city.indexOf("yo"));         // 3
        // System.out.println(city.toUpperCase());         // TOKYO  (new String)
        // System.out.println(city.toLowerCase());         // tokyo
        // System.out.println("$"+"      Tokyo      ".trim()+"$");   // "$tokyo$"


        // Sorted String :
        
        // String originalString = "Zhinjuku-ku tokyo,160-8484";
        // char[] chars = originalString.toCharArray();
        // Arrays.sort(chars);                              // special-chars 123 A-Z a-z
        // String sortedString = new String(chars);
        // System.out.println(sortedString);


	////////////////    String Builder     ////////////////

        // StringBuilder strB = new StringBuilder("Have a great day");
        // System.out.println(strB);

        // strB.deleteCharAt(2);
        // System.out.println(strB);

        // strB.delete(1, 14);
        // System.out.println(strB);
        // System.out.println(strB.length());

        // strB.setLength(10);
        // System.out.println("^"+strB+"^");
        // System.out.println(strB.length());
        // System.out.println(strB.charAt(5)=='\0');           // true : \0 - empty character
        

        // strB.append(99);
        // System.out.println(strB);

        // strB.delete(0, strB.length());
        // System.out.println(strB);

        // String str = "Hello";
        // strB.append(9==0);
        // strB.append(str, 1, 4);
        // System.out.println(strB);

        // System.out.println(strB.capacity());

        // System.out.println(strB.codePointAt(1));	// ASCII value
        // System.out.println(strB.chars());

        // for (int i : strB.chars().toArray()) {		// i - ASCII value
        //         System.out.print(i+"-"+Character.toString(i)+" ");
        // }

        // System.out.println("\n"+strB);

        // strB.insert(0, true);
        // System.out.println(strB);

        // System.out.println(strB.reverse());
        // System.out.println(strB.lastIndexOf("la", 5));
        // System.out.println(strB.lastIndexOf("eee"));

        // strB.setLength(0);
        // System.out.println(strB);
    }  
}

/////////////////////////////////////////////    (: The End :)    ////////////////////////////////////////////