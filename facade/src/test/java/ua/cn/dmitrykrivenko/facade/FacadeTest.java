package ua.cn.dmitrykrivenko.facade;

import org.junit.Test;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class FacadeTest {

    @Test
    public void testFacade() {
        Computer facade = new Computer();
        facade.start();
    }
}
