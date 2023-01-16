package number_generator;

import java.util.Objects;

public class NumberGenerator implements Runnable {
    private Thread myThread;

    public NumberGenerator() {
        myThread = new Thread(this,"my thread");
        System.out.println("my thread created " + myThread);
        myThread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing " + i);
                Thread.sleep(500);
                System.out.println("My hashcode: " + myThread.hashCode());
            }
        } catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberGenerator that = (NumberGenerator) o;
        return Objects.equals(myThread, that.myThread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myThread);
    }
}
