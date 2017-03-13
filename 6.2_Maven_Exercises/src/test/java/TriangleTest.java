import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by DK on 13.03.2017.
 */
public class TriangleTest {

    private Triangle f;

    @Before // vs @BeforeClass - rozni sie tym od Before ze metoda setUp wykona sie raz przed wszystkimi testami
    public void setUp() {
        f = new Triangle(4, 3);
    }

    @Ignore
    @Test
    public void testGetArea() {
        assertEquals(6, f.getArea(), 0);
    }

    @Ignore
    @Test
    public void testResize() {
        Triangle.resize(f, 2);
        assertEquals(6, f.getB(), 0);
    }

    @Test
    public void testAimpl() {
        Aimpl a = new Aimpl();
        a.mainProcess();
    }
}
