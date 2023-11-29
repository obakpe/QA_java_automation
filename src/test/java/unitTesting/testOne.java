package unitTesting;
/*
TestNG is a testing framework designed to simplify a broad range of testing needs,from unit testing to integration testing.
The "NG" in TestNG stands for "Next Generation," as it is an enhanced version of Junit, which was the most widely used testing framework for Java before TestNG came along. here are some key aspects of TestNG that make it particularly powerful and flexible.
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class testOne {
    @Test
    public void testOne() {
        int a = 10;
        int b =20;
        int c = 30;

        Assert.assertEquals(30, a+b);
    }
}