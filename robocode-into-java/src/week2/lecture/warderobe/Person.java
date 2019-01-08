package week2.lecture.warderobe;

public class Person {

    private String name;
    private Cloth cloth;

    public Person(String name) {
        this.name = name;
    }

    public void wear(Cloth cloth){
        this.cloth = cloth;

    }

    public void sayWhatIWear(){
        if (cloth == null){
            System.out.println(name+ " is naked");
            return;
        }
        System.out.println(name + " is  wearung a "+ cloth.getName());

    }



//it's the same as wear
    //public void setCloth(Cloth cloth) {
     //   this.cloth = cloth;
    //+}
}
