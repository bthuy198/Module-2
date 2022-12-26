package animal;

public interface Edible {
     int max  = 10;
    // mặc định của hang số: public final static
    // mặc định của phương thức trừu tượng trong interface: public abstract
    // Trong interface thì: chỉ chứa phương thức trừu tượng và hằng số
    String howToEat();
}
