package quadraticEquation;

public class Main {
    public static void main(String[] args) {


    }

    public static void result() {
        QuadraticEquation phuongtrinh1 = new QuadraticEquation(4, -2, -6);
        double delta = phuongtrinh1.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no roots");
        }
        if (delta == 0) {
            double x = -(phuongtrinh1.getB()) / (phuongtrinh1.getA() * 2);
            System.out.println("The equation has 1 root: " + x);
        }
        if (delta > 0) {
            System.out.printf("The equation has 2 root: %.0f, %.0f ", phuongtrinh1.getRoot1(), phuongtrinh1.getRoot2());
        }
    }
}
