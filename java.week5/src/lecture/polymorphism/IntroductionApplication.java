package lecture.polymorphism;

public class IntroductionApplication {

    public static void main(String[] args) {
        introduce();
        introduce("L");
        introduce("L","samanta");
        introduce("L",3);

        //They have the same name, but they look different
        //they do different things, but we can differentiate them
        //the number of arguments and their type is key
    }



    private static void introduce() {
        System.out.println("Pleased to meet you");
    }

    private static void introduce(String myself) {
        System.out.println("Pleased to meet you. I'm "+myself);
    }

    private static void introduce(String myself, String other) {
        System.out.println("Pleased to meet you, "+other+". I'm "+myself);
    }

    private static void introduce(String myself, Integer times) {
        for (int repetition= 0; repetition<times; repetition++) {
            System.out.println("Pleased to meet you. I'm "+myself);

        }

    }


}
