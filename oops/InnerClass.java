package oops;

public class InnerClass {
    public static void main(String[] args) {

        // Static Inner Class - NO Car object need to create
        Car.Wheel frontLeftWheel = new Car.Wheel();
        frontLeftWheel.RotateWheel();

        System.out.println("-----------------");

        // Inner Class - Car object need to create
        Car myCar = new Car();
        Car.Steering myCarSteering = myCar.new Steering();
        myCarSteering.steerLeft();
        
    }
}

class Car{
    Car(){
        System.out.println("Your car is ready to ride");
    }

    static class Wheel
    {
        void RotateWheel(){
            System.out.println("Rotating wheels");
        }
        void pumpingAirInWheels(){
            System.out.println("Wheels, full with air");
        }
    }

    class Steering{
        void steerLeft(){
            System.out.println("Steering to the Left");
        }
        void steerRight(){
            System.out.println("Steering to the Right");
        }
    }
}