package lecture.animal;

public class Cat extends Animal implements Talkative {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println(getName() + "miaus");

    }
}
