package oops.encapsulation;

public class Student {

    String name ;
    private boolean enrolled=false;
    private int paidAmount;

    public int getPaidAmount(){
        return paidAmount;
    }

    public void setEnroll(int paidAmount){
        this.paidAmount += paidAmount;
        if (this.paidAmount < 200){
            System.out.println("You havn't paid completely.!");
        }
        else{
            System.out.println("You have Enrolled Successfully.!");
            this.enrolled = true;
        }
    }

    public boolean isEnrolled() {
        return enrolled;
    }


}