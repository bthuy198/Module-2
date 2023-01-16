package prime_number;

public class OptimizedPrimeFactorization implements Runnable {
    private Thread myThread;

    public OptimizedPrimeFactorization() {
        myThread = new Thread(this, "Optimized prime factorization thread");
    }

    @Override
    public void run() {
        try {
            int totalNumber = 20;
            boolean isPrime;
            System.out.println("Optimized prime factorization thread " + 2);
            int number = 3;
            int count = 1;
            while (count < totalNumber) {
                isPrime = true;
                int range = (int) Math.sqrt(number);
                for (int i = 2; i <= range; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                    System.out.println("Optimized prime factorization thread " + number);
                }
                number++;
            }
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
    }

    public void start() {
        myThread.start();
    }
}
