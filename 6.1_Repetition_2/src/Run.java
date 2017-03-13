/**
 * Created by DK on 13.03.2017.
 */
public class Run {
        public static void main(final String[] args) {
                Figure rectangle = new Rectangle(3.9, 4.8);
                Figure triangle = new Triangle(4.5, 2.7, 2);

                System.out.println(rectangle.getArea());
                System.out.println(triangle.getArea());
                System.out.println(triangle.resize());

            }
}
