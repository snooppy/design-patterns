package ua.cn.dmitrykrivenko.facade;

import org.junit.Test;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class FacadeTest {

    @Test
    public void testFacade() {
        Computer facade = new Computer();
        facade.start();
    }
}
