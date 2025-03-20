package ua.cn.dmitrykrivenko.state;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface StateLike
{
    void writeName(final StateContext stateContext, final String name);
}
