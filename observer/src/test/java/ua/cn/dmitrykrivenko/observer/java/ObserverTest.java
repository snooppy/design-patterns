package ua.cn.dmitrykrivenko.observer.java;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class ObserverTest {

    @Test
    public void testObserver() {
        SomeData s = new SomeData();
        ValueDisplay valueDisplay = new ValueDisplay(s);
        s.setValue(113);

        Assert.assertTrue(valueDisplay.getValue() == 113);
    }
}
