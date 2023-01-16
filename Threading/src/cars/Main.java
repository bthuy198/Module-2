package cars;

public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 5;
    public static void main(String[] args) {
        Cars car1 = new Cars("BMW");
        Cars car2 = new Cars("Bentley");
        Cars car3 = new Cars("Ferrari");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        System.out.println("Distance = 100km");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
