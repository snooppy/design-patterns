package ua.cn.dmitrykrivenko.visitor;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface Element {

    public void accept(Visitor visitor);
}
