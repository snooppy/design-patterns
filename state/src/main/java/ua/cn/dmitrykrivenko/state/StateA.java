package ua.cn.dmitrykrivenko.state;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class StateA implements Statelike {

    public void writeName(StateContext stateContext, String name) {
        System.out.println(name.toLowerCase());
        stateContext.setState(new StateB());
    }
}
