import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 02.12.2016.
 */
public class SuperClassTest {
    SuperClass superClass;

    @Before
    public void setUp() throws Exception {

        superClass = new SuperClass();
    }

    @Test
    public void success0() throws Exception {
        String actual = superClass.superMethod(0);
        assertEquals("0", actual);
    }

    @Test
    public void success1() throws Exception {
        String actual = superClass.superMethod(1);
        assertEquals("1", actual);
    }
}