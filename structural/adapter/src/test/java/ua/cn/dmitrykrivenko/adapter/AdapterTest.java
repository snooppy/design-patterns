package ua.cn.dmitrykrivenko.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class AdapterTest {

    private Vector<String> v;
    private String testStr;

    @Before
    public void setUp() {
        v = new Vector<String>();
        testStr = "Test Adapter";
        v.add(testStr);
    }

    @Test
    public void testAdapter() {
        Enumeration<String> enumeration = v.elements();
        Iterator iterator = new EnumerationIteratorAdapter(enumeration);

        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(testStr, iterator.next());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdapter_shouldThrowUnsupportedOperationException() {
        Enumeration<String> enumeration = v.elements();
        Iterator iterator = new EnumerationIteratorAdapter(enumeration);
        iterator.remove();
    }
}
