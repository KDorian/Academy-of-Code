/**
 * Created by DK on 14.03.2017.
 */
public class Point3D extends Point2D {
    double z = 0;
    double distance = 0;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    
    public double distance(Point3D pointt1, Point3D point2) {
        distance = Math.sqrt(Math.pow((point2.getX()- pointt1.getX()), 2)+Math.pow((point2.getY()- pointt1.getY()), 2)+Math.pow((point2.getZ()- pointt1.getZ()), 2));
        return distance;
    }

}
