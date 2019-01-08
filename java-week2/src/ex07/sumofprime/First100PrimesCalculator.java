package ex07.sumofprime;

//is responsible for the orchestration of  the interaction of the previous
//classes. It has a getSumOfThe100FirstPrimeNumbers method that has public
// visibility.


import java.util.List;

public class First100PrimesCalculator {

    private NumberGenerator generator = new NumberGenerator();
    private PrimeFinder primeFinder = new PrimeFinder();
    private NumberAccumulator accumulator = new NumberAccumulator();

    public Integer getSumOfThe100FirstPrimeNumber(){
        List<Integer> numbers = generator.generateFirst550();
        List<Integer> primes = primeFinder.findFirst100primes(numbers);
        return accumulator.accumulate(primes);

    }
}
