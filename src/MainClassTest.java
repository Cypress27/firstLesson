import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass localNumber = new MainClass();
        Assert.assertTrue("Local number != 14",localNumber.getLocalNumber() == 14);
    }
}
