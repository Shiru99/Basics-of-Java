package oops;

class Vehicles{
    int wheels;
    int headlights = 2;
    String color;

    // Vehicles(){                                   // Default constructor // not visible
    //     wheels = 0;
    //     color = "";
    //     headlights = 2;
    // }

    Vehicles(){                     //once manually constructor is added, Default constructors gets removed.
        wheels = 4;
        color = "Black";
        System.out.println("Object of vehicle has been Created.");
    }

    Vehicles(int noOfWheels , String color){       
        wheels = noOfWheels;
        this.color = color;                                            // this points variable of current class
        System.out.println("Object of vehicle has been Created.");
    }

    

}
public class MyConstructors {               // ONLY ONE public class
     
    public static void main(String args[])
    {
        Vehicles car = new Vehicles();   
        System.out.println(car.wheels +"-Wheeler & color is "+ car.color);      // 4-Wheeler & color is Black

        Vehicles autoRickshaw = new Vehicles(3,"black & Yellow");
        System.out.println(autoRickshaw.wheels +"-Wheeler & color is "+ autoRickshaw.color);   
        //                                                           3-Wheeler & color is black & Yellow        


    }  
}
