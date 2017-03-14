/**
 * Created by DK on 14.03.2017.
 */
public class PointTest {
    public static void main(final String[] args) {

        Point2D point2D = new Point2D(4, 5);
        Point3D point3D = new Point3D(3, 6, 9);

        System.out.println("Point 2D: " + point2D.getX() + ", " + point2D.getY());
        System.out.println("Point 3D: " + point3D.getX() + ", " + point3D.getY() + ", " + point3D.getZ());


    }
}
