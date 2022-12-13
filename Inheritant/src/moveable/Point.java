package moveable;

public class Point {
    float x = 0.0f;
    float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = {this.x, this.y};
        return xy;
    }
    public void setXY(float x, float y) {
        this.x = y;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(x,y) = " + "(" + getXY()[0] + "," + getXY()[1] + ")";
    }
}
