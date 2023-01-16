package synchronization;

public class Main {
    public static void main(String[] args) {
        final Demo demo = new Demo();
//        MyThread1 t1 = new MyThread1(demo);
//        MyThread2 t2 = new MyThread2(demo);
//        t1.start();
//        t2.start();
        Thread t1 = new Thread(){
            public void run(){
                demo.printTable(5);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                demo.printTable(100);
            }
        };
        t1.start();
        t2.start();
    }
}
