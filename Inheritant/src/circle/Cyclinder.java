package circle;

public class Cyclinder extends Circle {
    private double high = 1.0;

    public Cyclinder() {
    }

    public Cyclinder(double radius, String color) {
        super(radius, color);
    }

    public Cyclinder(double radius, String color, double high) {
        super(radius, color);

        this.high = high;

    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getTotalArea() {
        return 2 * (super.getArea()) + (2 * Math.PI * getRadius() * high);
    }

    //thể tích
    public double getVolume(){
        return Math.PI * getRadius() * 2 * high;
    }

    // hàm toString mục đích: hiển thị ra thông tin của đối tượng
    @Override
    public String toString() {
        return super.toString() + " total area = " + getTotalArea() + " volume = " + getVolume();
    }
}

class TestCyclinder{
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "dark");
        System.out.println(circle);
        Cyclinder cycl1 = new Cyclinder();
        System.out.println(cycl1);
        Circle cycl2 = new Cyclinder(5.5, "yellow", 3);
        System.out.println(cycl2);
    }
}