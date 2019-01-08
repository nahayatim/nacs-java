package lecture.makeup;

public class Girl {

    private Lipstick redLipstick;

    public Girl(Lipstick Lipstick) {
        this.redLipstick = Lipstick;
    }

    public void wearMakeup() {
        System.out.println("I will wear lipstick color "+ redLipstick.getColor());
    }
}
