package fan;

public class ManufactureFan {
    private Fan[] fans;

    public ManufactureFan() {
    }

    public void productFan() {
        fans = new Fan[5];
        Fan fan1 = new Fan("SK1", 1, false, 5.0, "pink");
        Fan fan2 = new Fan("SK2", 1, false, 5.0, "blue");
        Fan fan3 = new Fan("SK3", 1, true, 5.0, "red");
        Fan fan4 = new Fan("SK4", 1, false, 5.0, "red");
        Fan fan5 = new Fan("SK5", 3, false, 5.0, "red");
        fans[0] = fan1;
        fans[1] = fan2;
        fans[2] = fan3;
        fans[3] = fan4;
        fans[4] = fan5;
        fan3.setOn(true);
        fan1.setSpeed(4);
        turnOnByColor("red");
        upSpeedByColor("red");
        showFan();
    }

    public void upSpeedByColor(String color) {
        for (int i = 0; i < fans.length; i++) {
            if (fans[i].getColor().equals(color.toLowerCase())) {
                int oldSpeed = fans[i].getSpeed();
                fans[i].setSpeed(++oldSpeed);
            }
        }
    }
    public void turnOnByColor(String color){
        for (int i = 0; i < fans.length; i++) {
            if (fans[i].getColor().equals(color.toLowerCase())) {
                fans[i].setOn(true);
            }
        }
    }

    public void showFan() {
        for (int i = 0; i < fans.length; i++) {
            System.out.println(fans[i].toString());
        }
    }
    public static void main(String[] args) {
        ManufactureFan manufactureFan = new ManufactureFan();
        manufactureFan.productFan();
    }
}
