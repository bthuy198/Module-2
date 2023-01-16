package number_generator;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberGenerator());
        Thread thread2 = new Thread(new NumberGenerator());
        thread1.start();
        thread2.start();
    }
}
