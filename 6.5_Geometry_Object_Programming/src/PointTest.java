/**
 * Created by DK on 14.03.2017.
 */
public class PointTest {
    public static void main(final String[] args) {

        Point2D point2D = new Point2D(4, 5);
        Point3D point1= new Point3D(3, 6, 9);
        Point3D point2= new Point3D(1, 1, 1);



        System.out.println("Point 2D: " + point2D.getX() + ", " + point2D.getY());
        System.out.println("Point 3D: " + point1.getX() + ", " + point1.getY() + ", " + point1.getZ());
        System.out.println("Distance: " + point2.distance(point1, point2));


    }
}
