package reflection;

//has an address and also a boolean that states if it is stamped.
//It has a getAddress method. It also has a isStamped method that returns
//whether the letter has been stamped. It also has a stamp method that
//sets the stamped attribute to true.


public class Letter {

    private String address;
    private Boolean stamped = false;

    public Letter(String address) {
        this.address = address;
    }

    public void stamp(){
        stamped = true;
    }


    public String getAddress() {
        return address;
    }

    public boolean isStamped() {
        return stamped;
    }

}
