import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by DK on 13.03.2017.
 */
public class TriangleTest {
    @Test
    public void testGetArea() {
        Figure f = new Triangle(4, 3);
        assertEquals(6, f.getArea(), 0);
    }

    @Test
    public void testResize() {
        Triangle f = new Triangle(4, 3);
        Triangle.resize(f, 2);
        assertEquals(6, f.getB(), 0);
    }
}
