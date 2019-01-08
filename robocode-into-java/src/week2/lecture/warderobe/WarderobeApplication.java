package week2.lecture.warderobe;

public class WarderobeApplication {
    public static void main(String[] args) {
        Person mahtab = new Person("mahtab");
        Cloth dress = new Cloth("dress");

        mahtab.sayWhatIWear();
        mahtab.wear(dress);
        mahtab.sayWhatIWear();

        Person ashkan = new Person("Ashkan");
        ashkan.wear(dress);
        ashkan.sayWhatIWear();

        Cloth polo_shirt = new Cloth("polo shirt");
        ashkan.wear(polo_shirt);
        ashkan.sayWhatIWear();

        ashkan = new Person("Aizhana");
        Cloth pijama = new Cloth("pijama");
        ashkan.wear(dress);
        ashkan.sayWhatIWear();

    }
}
