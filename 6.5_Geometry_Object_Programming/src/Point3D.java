/**
 * Created by DK on 14.03.2017.
 */
public class Point3D extends Point2D {
    int z = 0;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

}
