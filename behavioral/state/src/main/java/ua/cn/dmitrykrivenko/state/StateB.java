package ua.cn.dmitrykrivenko.state;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class StateB implements Statelike {

    @Override
    public void writeName(final StateContext stateContext, final String name) {
        System.out.println(name.toUpperCase());
        stateContext.setState(new StateA());
    }
}
