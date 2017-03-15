import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by DK on 14.03.2017.
 */
public class PairsTest {

    private static Pairs<String, Double> pairs;
    @BeforeClass
    public static void setUp() {
        pairs = new Pairs<String, Double>();
        pairs.add("word1", 30.5);
        pairs.add("word2", 343430.5);
        pairs.add("word2", 343430.5);
    }


    @Test
    public void testKeyExists() {
        assertTrue(pairs.check("word2"));
        assertTrue(!pairs.check("abc"));

    }

    @Test
    public void testCount() {
        assertEquals(1, pairs.countElements("word2"));
    }
}
