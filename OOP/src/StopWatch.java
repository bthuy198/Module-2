import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        System.out.println("Start");
        stopWatch.start();

        String kt = scn.nextLine();
        if (kt.equals("ok")) {
            stopWatch.end();

        }
//        stopWatch.end();
        System.out.println("end");
        System.out.println("Time = " + (stopWatch.getElapsedTime() / 1000));
    }
}
