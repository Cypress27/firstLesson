import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass localNumber = new MainClass();
        Assert.assertTrue("Local number != 14",localNumber.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {
        MainClass classNumber = new MainClass();
        Assert.assertTrue("Class number <= 45",classNumber.getClassNumber()>45);
    }

    @Test
    public void testGetClassString() {
        MainClass classString = new MainClass();
        Assert.assertTrue("Class string doesn't contain hello/Hello",
                classString.getClassString().contains("Hello")||classString.getClassString().contains(("hello")));
    }
}
