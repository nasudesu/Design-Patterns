package StringManipulator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringManipulatorTest {
    @BeforeClass
    public static void setUp() {
        System.out.println("Running StringManipulatorTest");
    }
    StringManipulator sm = new StringManipulator();
    @Test
    public void reverse() {
        assertEquals("tac", sm.reverse("cat"));
    }
    @Test
    public void capitalize() {
        assertEquals("CAT", sm.capitalize("cat"));
    }
    @AfterClass
    public static void tearDown() {
        System.out.println("StringManipulatorTest finished");
    }
}