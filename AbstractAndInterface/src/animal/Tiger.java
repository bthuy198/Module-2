package animal;

public class Tiger extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "gru gru";
    }

    @Override
    public String howToEat() {
        return "Can't eat it";
    }
}
