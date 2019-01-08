package exercises.ex02;

 //It has two private String attributes called flavor and topping. It receives
//the values through the constructor. It has the abstract method eat that
//returns a String. The method cannot have any implementation because the
//way we eat it will depend on the specific classes that extend from it.
//Add to the IceCream abstract class the protected getFlavor and getTopping methods
//that return the attribute values



public abstract class IceCream {

    private String flavor;
    private String topping;

    public IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }

   public abstract String eat();

    protected String getFlavor() {
        return flavor;
    }

    protected String getTopping() {
        return topping;
    }
}
