package lecture.makeup;

public class GirlApplication {
    public static void main(String[] args) {

        RedLipstick redLipstick = new RedLipstick();
        PinkLipstick pinkLipstick = new PinkLipstick();
        Girl girl = new Girl(pinkLipstick);
        girl.wearMakeup();

    }
}
