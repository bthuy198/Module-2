package car;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Bentley", "SKY3");
        System.out.printf("ID of car1: 000%d", car1.getCarOfId()).println();
        System.out.println("Total of car: " + Car.numberOfCars);
        Car car2 = new Car("BMW", "SKY6");
        System.out.printf("ID of car2: 000%d",car2.getCarOfId()).println();
        System.out.println("Total of car: " + Car.numberOfCars);
    }
}
