package point;

public class Point3D extends Poin2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = {super.getX(), super.getY(), this.z};
        return xyz;
    }

    public String toString() {
        return "(x,y,z) = " + "(" + getXYZ()[0] + "," + getXYZ()[1] + "," + getXYZ()[2] + ")";
    }
}

class Test3D {
    public static void main(String[] args) {
        Point3D point3d = new Point3D();
        point3d.setZ(3);
        System.out.println(point3d);
    }
}