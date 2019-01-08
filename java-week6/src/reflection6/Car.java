package reflection6;

//The Car class must be abstract. It has a brand that is given with the
//constructor. It has the drive method.A car can drive. When it does, it
//returns a message saying “<car kind> <brand>”.


public abstract class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }



    public String  drive(){
        return getKind()+" "+ brand;

    }

    protected abstract String getKind();
}
