package animal;

// 1 lớp có thể triển khai nhiều interface
public abstract class Fruit implements Edible, CachChamSoc{

    // 1 lớp con triển khai 1 interface thì: phải ghi đè những phương thức cua interface
    @Override
    public String howToEat() {
        return "Eat it now";
    }

    @Override
    public void cachChamSoc() {

    }
}
