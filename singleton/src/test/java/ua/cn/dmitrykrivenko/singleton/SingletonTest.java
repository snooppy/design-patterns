package ua.cn.dmitrykrivenko.singleton;

/**
 * Unit test for simple Singleton.
 */
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingleton() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Assert.assertSame("s2 should be the same object as s1", s1, s2);
    }
}
