package animal;

public abstract class Fruit implements Edible{
    @Override
    public String howToEat() {
        return "Eat it now";
    }
}
