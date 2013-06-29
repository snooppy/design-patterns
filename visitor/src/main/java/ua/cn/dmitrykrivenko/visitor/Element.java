package ua.cn.dmitrykrivenko.visitor;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public interface Element {

    public void accept(Visitor visitor);
}
