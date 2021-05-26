package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test(expectedExceptions = AssertionError.class)
    public void testNotEquals() {
        Assert.assertNotEquals(0L, 0);
    }
}
