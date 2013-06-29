package ua.cn.dmitrykrivenko.prototype;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class PrototypeTest {

    @Test
    public void testPrototype() throws CloneNotSupportedException {
        Cookie prot = new CoconutCookie();
        CookieMachine cm = new CookieMachine(prot);
        Cookie tempCookie = cm.makeCookie();

        Assert.assertEquals(CoconutCookie.class, tempCookie.getClass());
    }
}
