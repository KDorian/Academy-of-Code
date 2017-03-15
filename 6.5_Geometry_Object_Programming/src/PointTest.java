/**
 * Created by DK on 14.03.2017.
 */
public class PointTest {
    public static void main(final String[] args) {

        Point2D point3 = new Point2D(4, 5);
        Point2D point4 = new Point2D(3, 6);
        Point3D point1 = new Point3D(3, 6, 9);
        Point3D point2 = new Point3D(1, 1, 1);

        System.out.println("Point 2D: " + point3.getX() + ", " + point3.getY());
        System.out.println("Point 3D: " + point1.getX() + ", " + point1.getY() + ", " + point1.getZ());
        System.out.println("Distance in 3D: " + point1.getDistance(point2));
        System.out.println("Distance in 2D: " + point3.getDistance(point4));


    }
}
