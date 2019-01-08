import java.util.Random;

public class Randomizaton {
    public static void main(String[] args) {

        Random random = new Random();
        //any possible int positive and negative value
        int randomInteger = random.nextInt();
        System.out.println(randomInteger);

        //between 0 and limit-1
        int limit =5;
        int randomIntegerBetweenZeroAndFive = random.nextInt(limit);
        System.out.println(randomIntegerBetweenZeroAndFive);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);


    }
}
