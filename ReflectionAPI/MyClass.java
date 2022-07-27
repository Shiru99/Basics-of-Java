package ReflectionAPI;

class iPhoneX extends SmartPhone {

    public static void showOff() {
        System.out.println("IPhoneX is the new generation of iPhone");
    }

    private String releaseDate = "2018";
    public String brand = "Apple";
    protected int price = 99_999;
    boolean isAvailable = false;

    public iPhoneX() {
        System.out.println("iPhoneX constructor");
    }

    public iPhoneX(String str) {
        System.out.println("iPhoneX constructor with parameter: " + str);
    }

    private iPhoneX(String str, String str2) {
        System.out.println("iPhoneX constructor with parameter: " + str);
        System.out.println("iPhoneX constructor with parameter: " + str2);
    }

    @Override
    public void takeSelfie() {
        System.out.println("Your iPhoneX is taking selfie");
        initiateSelfieAction();
        System.out.println("Your iPhoneX is done taking selfie");
    }

    public void trackLocation() {
        System.out.println("iPhoneX can track location");
    }

    private String getReleaseDate() {
        return releaseDate;
    }

    protected String getBrand() {
        return brand;
    }

    int getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

abstract class SmartPhone extends Phone implements Camera, GPS {

    protected void initiateSelfieAction() {
        System.out.println("------------------");
        turnOnTorch();
        takeAPic();
        playPicClickSound();
        turnOffTorch();
        processThePic();
        storeToLocalStorage();
        addPreviewToCameraApp();
        System.out.println("------------------");
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