package fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private String id;
    private int speed = SLOW;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
    }

    public Fan(String id, int speed, boolean on, double radius, String color) {
        this.id = id;
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        if(speed > 3){
            this.speed = FAST;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan: " + id + " " + speed + " " + (isOn() == true ? "Fan is on " : "Fan is off ") + color;
    }
}
