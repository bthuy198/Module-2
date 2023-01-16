package prime_number;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        lazyPrimeFactorization.start();

        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        optimizedPrimeFactorization.start();
    }
}
