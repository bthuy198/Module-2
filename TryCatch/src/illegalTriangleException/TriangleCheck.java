package illegalTriangleException;

public class TriangleCheck {
    public void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        boolean checkSide = a > 0 && b > 0 && c > 0;
        if (a + b <= c || a + c <= b || b + c <= a && checkSide == false) {
            throw new IllegalTriangleException("Error: Invalid triangle");
        } else {
            System.out.println("Valid triangle");
        }
    }

}
