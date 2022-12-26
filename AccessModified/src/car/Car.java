package car;

public class Car {
    private int carOfId;
    private String name;
    private String engine;

    public static int idCar;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.carOfId = ++idCar;
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public int getCarOfId() {
        return carOfId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}
