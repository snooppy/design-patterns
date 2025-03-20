package ua.cn.dmitrykrivenko.visitor;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface Visitor {

    void visit(City city);

    void visit(Museum museum);

    void visit(Park park);
}
