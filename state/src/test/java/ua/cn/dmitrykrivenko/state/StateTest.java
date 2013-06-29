package ua.cn.dmitrykrivenko.state;

import org.junit.Test;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class StateTest {

    @Test
    public void testState() {
        StateContext stateContext = new StateContext();

        stateContext.writeName("Monday");
        stateContext.writeName("Tuesday");
        stateContext.writeName("Wednesday");
        stateContext.writeName("Thursday");
        stateContext.writeName("Friday");
        stateContext.writeName("Saturday");
        stateContext.writeName("Sunday");
    }
}
