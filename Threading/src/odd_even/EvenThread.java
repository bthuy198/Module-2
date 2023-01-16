package odd_even;

public class EvenThread extends Thread{
    public EvenThread() {
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Printing " + i + " even thread");
                }
            }
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
    }
}
