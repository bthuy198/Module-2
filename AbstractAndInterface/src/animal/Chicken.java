package animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "cluck cluck";
    }

    @Override
    public String howToEat() {
        return "Fry it";
    }
}
