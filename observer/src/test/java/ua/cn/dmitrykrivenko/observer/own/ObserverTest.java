package ua.cn.dmitrykrivenko.observer.own;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple Observer.
 */
public class ObserverTest {

    @Test
    public void testObserver() {
        SomeData someData = new SomeData();

        ValueDisplay displayValue = new ValueDisplay(someData);
        someData.setValue(111);

        Assert.assertEquals(111, displayValue.getValue());
    }
}
