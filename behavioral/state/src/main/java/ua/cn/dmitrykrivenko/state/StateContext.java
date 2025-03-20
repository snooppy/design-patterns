package ua.cn.dmitrykrivenko.state;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public final class StateContext {

    private StateLike myState;

    public StateContext() {
        setState(new StateA());
    }

    public void setState(final StateLike newState) {
        myState = newState;
    }

    public void writeName(final String name) {
        myState.writeName(this, name);
    }
}
