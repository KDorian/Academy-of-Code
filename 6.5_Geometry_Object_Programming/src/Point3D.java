/**
 * Created by DK on 14.03.2017.
 */
public class Point3D extends Point2D{
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(){
        super();
        z = 0;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + z;
    }

    @Override
    public double getDistance(IPoint point) {
        double x1 = x - point.getX();
        double y1 = y - point.getY();
        double z1 = z - point.getZ();
        return Math.sqrt(x1*x1+y1*y1+z1*z1);
    }

}
