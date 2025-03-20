package ua.cn.dmitrykrivenko.visitor;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface Element {

    void accept(Visitor visitor);
}
