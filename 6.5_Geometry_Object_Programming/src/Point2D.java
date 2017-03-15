/**
 * Created by DK on 14.03.2017.
 */
public class Point2D implements IPoint{
    protected double x;
    protected double y;

    public Point2D() {
        this.x = this.y = 0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return 0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        z = 0;
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }


    @Override
    public double getDistance(IPoint point) {
        double x1 = x - point.getX();
        double y1 = y - point.getY();
        return Math.sqrt(x1*x1+y1*y1);

    }
}
