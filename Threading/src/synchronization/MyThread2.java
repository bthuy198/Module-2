package synchronization;

public class MyThread2 extends Thread{
    Demo t;
    MyThread2(Demo t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}
