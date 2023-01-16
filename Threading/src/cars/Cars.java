package cars;


import java.util.Random;

import static cars.Main.DISTANCE;
import static cars.Main.STEP;

public class Cars implements Runnable {
    private String name;
    public Cars() {
    }

    public Cars(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //Khởi tao điểm start
        int runDistance = 0;
        //Khởi tạo thời gian bắt đầu
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random().nextInt(40));
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + this.name + ": " + log + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + this.name + " broken...");
            }
            long endTIme = System.currentTimeMillis();
            System.out.println("Car " + this.name + " finished in " + (endTIme - startTime) / 1000 + "s");
        }
    }
}
