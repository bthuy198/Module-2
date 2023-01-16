package synchronization;

public class MyThread1 extends Thread{
    Demo t;
    MyThread1(Demo t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
