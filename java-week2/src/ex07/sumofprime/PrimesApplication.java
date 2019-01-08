package ex07.sumofprime;

//the main method that uses the First100PrimesCalculator class
// and shows the output


public class PrimesApplication {

    public static void main(String[] args) {

        First100PrimesCalculator first100PrimesCalculator = new First100PrimesCalculator();
        Integer sum = first100PrimesCalculator.getSumOfThe100FirstPrimeNumber();
        System.out.println("The sum of the first 100 prime numbers is: "+ sum);
    }
}
