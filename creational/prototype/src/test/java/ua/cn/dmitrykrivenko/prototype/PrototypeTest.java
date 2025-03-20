package ua.cn.dmitrykrivenko.prototype;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class PrototypeTest {

    @Test
    public void testPrototype() throws CloneNotSupportedException {
        Cookie prototype = new CoconutCookie();
        CookieMachine cm = new CookieMachine(prototype);
        Cookie tempCookie = cm.makeCookie();

        Assert.assertEquals(CoconutCookie.class, tempCookie.getClass());
    }
}
