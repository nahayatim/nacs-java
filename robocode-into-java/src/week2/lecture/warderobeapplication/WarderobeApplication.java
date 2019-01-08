package week2.lecture.warderobeapplication;

public class WarderobeApplication {

    public static void main(String[] args) {
        Person mahtab = new Person("mahtab");
        Cloth dress= new Cloth("Dress");

        mahtab.wear(dress);
        mahtab.sayWhatIWear();

        Person ashkan = new Person("Ashkan");
        ashkan.wear(dress);
        ashkan.sayWhatIWear();

        Cloth poloShirt= new Cloth("polo shirt");
        ashkan.wear(poloShirt);
        ashkan.sayWhatIWear();

        ashkan=new Person("Aizhana");
        ashkan.wear(dress);
        ashkan.sayWhatIWear();
    }
}
