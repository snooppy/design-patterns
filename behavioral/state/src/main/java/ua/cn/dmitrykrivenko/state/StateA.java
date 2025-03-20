package ua.cn.dmitrykrivenko.state;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class StateA implements StateLike
{

    @Override
    public void writeName(StateContext stateContext, String name) {
        System.out.println(name.toLowerCase());
        stateContext.setState(new StateB());
    }
}
