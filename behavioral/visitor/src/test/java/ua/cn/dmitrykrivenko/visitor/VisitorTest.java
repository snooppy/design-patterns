package ua.cn.dmitrykrivenko.visitor;

import org.junit.Test;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class VisitorTest {

    @Test
    public void testVisitor() {
        FirstTimeVisitor visitor = new FirstTimeVisitor();
        City city = new City();
        city.accept(visitor);
    }
}
