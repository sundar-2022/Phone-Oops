public class Landline implements Phone {

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    public String getMyPhoneNo() {

        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {

        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {

        isRinging = ringing;
    }

    public boolean isPowerOn() {

        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if (isPowerOn) {
            System.out.println("your dialing " + phoneNo);
        } else {
            System.out.println("Your power is switched off");
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
        if (isPowerOn && myPhoneNo.equals(phoneNo)) {
            isRinging = true;
            System.out.println("your receiving call " + myPhoneNo);
        } else {
            System.out.println("Not reachable");
        }
    }

    @Override
    public boolean answerCall() {
        if (isRinging) {
            isRinging = false;
            System.out.println("call answered");
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
