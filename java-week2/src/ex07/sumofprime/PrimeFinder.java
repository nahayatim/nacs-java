package ex07.sumofprime;

//responsible for receiving a list of Integer numbers and returns
// a list of Integer that contains from those numbers only the first 100 primes.
// This method has a default visibility and should not be possible to use it
// from the main method.


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {


    List<Integer>findFirst100primes(List<Integer>numbers){
        Integer primesFound = 0;
        List<Integer>primes = new ArrayList<>();
        for (Integer number : numbers) {
            if (isPrime(number)){
                primes.add(number);
                primesFound++;
                if (primesFound == 100){
                    return primes;
                }
            }
        }
        return primes;
    }
    private boolean isPrime(Integer number){
        BigInteger potentialPrime = BigInteger.valueOf(number);
        return potentialPrime.isProbablePrime(100);
    }

}
