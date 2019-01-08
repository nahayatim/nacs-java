package reflection6;

public class AutomaticCar extends Car {


    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    protected String getKind() {
        return "Automatic";
    }
}
