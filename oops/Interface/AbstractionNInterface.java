package oops.Interface;

public class AbstractionNInterface {

    public static void main(String[] args) {

        iPhoneX myIPhoneX = new iPhoneX();
        Nokia_1100 myNokia1100 = new Nokia_1100();

        System.out.println("----------------------------------------------------");
        myIPhoneX.takeSelfie();
        System.out.println("----------------------------------------------------");
        myNokia1100.callContact();

        GPS myGPS = new iPhoneX();
        myGPS.trackLocation();

    }

}

class iPhoneX extends SmartPhone {

    @Override
    public void takeSelfie() {
        System.out.println("Your iPhoneX is taking selfie");
        initiateSelfieAction();
        System.out.println("Your iPhoneX is done taking selfie");
    }

    public void trackLocation() {
        System.out.println("iPhoneX can track location");
    }
}

abstract class SmartPhone extends Phone implements Camera, GPS {

    protected void initiateSelfieAction() {
        turnOnTorch();
        takeAPic();
        playPicClickSound();
        turnOffTorch();
        processThePic();
        storeToLocalStorage();
        addPreviewToCameraApp();
    }

    private void turnOnTorch() {
        System.out.println("Torch functionality initiated");
    }

    private void takeAPic() {
        System.out.println("Collecting inputs from camera sensors");
    }

    private void playPicClickSound() {
        System.out.println("Playing sound");
    }

    private void turnOffTorch() {
        System.out.println("Torch functionality ended");
    }

    private void processThePic() {
        System.out.println("Processing the picture");
    }

    private void addPreviewToCameraApp() {
        System.out.println("Adding preview to camera app");
    }

    private void storeToLocalStorage() {
        System.out.println("Storing the picture to local storage");
    }

    public void sendMessage() {
        System.out.println("iPhoneX can send message");
    }

    public void phoneDetails() {
        System.out.println("This is a smartphone");
    }
}

class Nokia_1100 extends Phone {

    public void sendMessage() {
        System.out.println("Nokia 1100 can send message");
    }
}

abstract class Phone implements Contacts, Messaging {

    @Override
    public void callContact() {
        System.out.println("Phone can call contact");
    }

    public void phoneDetails() {
        System.out.println("This is a phone");
    }
}



abstract interface Camera {

    void takeSelfie();

    default void CameraApplicationDetails() {
        System.out.println("This is CAMERA application");
    }
}

abstract interface GPS {

    void trackLocation();

    default void GPSApplicationDetails() {
        System.out.println("This is GPS application");
    }
}

abstract interface Contacts {

    void callContact();

    default void ContactsApplicationDetails() {
        System.out.println("This is CONTACTS application");
    }
}

abstract interface Messaging {

    void sendMessage();

    default void MessagingApplicationDetails() {
        System.out.println("This is MESSAGING application");
    }
}