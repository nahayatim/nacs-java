package lecture.polymorphism;

public class GreetingApplication {

    public static void main(String[] args) {
        Greeting hello = new Hello();
        Greeting hi = new Hi();

        hello.greet();
        hi.greet();
        //They look exactly the same, but they do different things
        //we cannot differentiate them
    }
}
