import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by DK on 14.03.2017.
 */
public class UtilTest {
@Test
    public void fromArrayTest() {
    String tab[] = {"abc", "xyz"};
    List<String> list = new LinkedList<String>();
    Util.fromArrayToCollection(tab, list);
    assertEquals(tab.length, list.size());
}
}


