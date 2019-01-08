package reflection6;

public class ManualCar extends Car {


    public ManualCar(String brand) {
        super(brand);
    }

    @Override
    protected String getKind() {
        return "Manual";
    }
}







