package oops.staticDetails;

public class InnerClass {
    public static void main(String[] args) {

        /* Static Inner Class - NO Car object need to create */
        Car.Wheel frontLeftWheel = new Car.Wheel();
        frontLeftWheel.RotateWheel();

        Car myCar = new Car();

        /* Inner Class - Car object need to create */
        Car.Steering myCarSteering = myCar.new Steering();
        myCarSteering.steerLeft();
    }
}

class Car {

    Car() {
        System.out.println("Your car is ready to ride");
    }

    class Steering {
        void steerLeft() {
            System.out.println("Steering to the Left");
        }
    }

    static class Wheel {
        void RotateWheel() {
            System.out.println("Rotating wheels");
        }
    }
}