package moveable;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1, 1);
        MoveablePoint moveable = new MoveablePoint(1,1,3,4);
        moveable.move();
        System.out.println(moveable.getX());
        System.out.println(moveable.getY());
    }
}
