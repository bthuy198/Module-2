package shape;

public class ComparableRect extends Rectangle implements Comparable<ComparableRect>{
    public ComparableRect() {
    }

    public ComparableRect(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRect o) {
        if(getArea() > o.getArea()) return 1;
        else if(getArea() ==  o.getArea()) return 0;
        else return -1;
    }


}
