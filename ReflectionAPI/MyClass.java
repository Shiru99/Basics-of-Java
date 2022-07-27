package ReflectionAPI;

class iPhoneX extends SmartPhone {

    private String releaseDate = "2018";
    public String brand = "Apple";
    protected int price = 99_999;
    boolean isAvailable = false;

    public iPhoneX() {
        System.out.println("iPhoneX constructor");
    }

    public iPhoneX(String str){
        System.out.println("iPhoneX constructor with parameter: " + str);
    }

    
    private iPhoneX(String str,  String str2){
        System.out.println("iPhoneX constructor with parameter: " + str);
        System.out.println("iPhoneX constructor with parameter: " + str2);
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

    public boolean isAvailable() {
        return isAvailable;
    }



    @Override
    public void sendMessage() {
        System.out.println("iPhoneX can send message");
    }

    public void trackLocation() {
        System.out.println("iPhoneX can track location");
    }
}

abstract class SmartPhone extends Phone implements Camera, GPS {

    boolean is4GActive = true;

    @Override
    public void takeSelfie() {
        System.out.println("SmartPhone can take selfie");
    }

    public void phoneDetails() {
        System.out.println("This is a smartphone");
    }
}

class Nokia_1100 extends Phone {

    int price = 9_999;
    String brand = "Nokia";

    public void sendMessage() {
        System.out.println("Nokia 1100 can send message");
    }
}

abstract class Phone implements Contacts, Messaging {

    boolean is3GActive = true;

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