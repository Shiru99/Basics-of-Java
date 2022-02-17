/*
    All OOPs concepts
*/
package oops.OOPS;

public class Oops {
    public static void main(String[] args) {
        smartPhone myPhone = new SamSungM31();
        myPhone.selfie();
        myPhone.call();

        System.out.println("\n---\n");

        Camera myCam = new DSLR();
        myCam.zoomIn();
        myCam.takePhoto();
    }
}

abstract class phone{
    void call(){
        System.out.println("Phone is calling with 2G");
    }

    void charge(){
        System.out.println("Phone is charging");
    }
}

abstract class smartPhone extends phone implements CameraInterface, GPS{

    @Override
    public void call() {
        System.out.println("smartPhone calling with 4G");
    }

    public void selfie(){
        System.out.println("smartPhone taking a selfie");
    }

    @Override
    public void getLocation() {
        System.out.println("smartPhone collecting your location");
        
    }

    @Override
    public void takePhoto() {
        System.out.println("smartPhone taking a photo");
        
    }

    @Override
    public void takeVideo() {
        System.out.println("smartPhone taking a video");
        
    }

}

class SamSungM31 extends smartPhone{

    public SamSungM31() {
        System.out.println("Welcome To SamSung world");
    }
    
}

interface GPS{
    void getLocation();
}

interface CameraInterface {
    void takePhoto();
    void takeVideo();
}


abstract class Camera implements CameraInterface{

    abstract void zoomIn();
    abstract void zoomOut();

    public void takePhoto(){
        System.out.println("Camera is taking a photo");
    }

    public void takeVideo(){
        System.out.println("Camera is taking a Video");
    }
}

class DSLR extends Camera{

    public DSLR(){
        System.out.println("Welcome to DSLR world");
    }

    @Override
    void zoomIn() {
        System.out.println("Zoom in");
    }

    @Override
    void zoomOut() {
        System.out.println("Zoom out");
    }

    public void takePhoto(){
        System.out.println("DSLR is taking photo");
    }
}