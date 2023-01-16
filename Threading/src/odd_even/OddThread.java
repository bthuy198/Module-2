package odd_even;

public class OddThread extends Thread {
    public OddThread() {
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 1) {
                    System.out.println("Printing " + i + " odd thread");
                }
            }
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
    }
}
