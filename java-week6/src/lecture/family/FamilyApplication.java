package lecture.family;

public class FamilyApplication {
    public static void main(String[] args) {

        Grandma grandma = new Grandma();
        Mom mom = new Mom();
        Samanta samanta = new Samanta();

        System.out.println("--Grandma--");
        grandma.bake();

        System.out.println("--Mom--");
        mom.bake();
        mom.drive();

        System.out.println("--Samanta--");
        samanta.bake();
        samanta.drive();
        samanta.text();
    }



}
