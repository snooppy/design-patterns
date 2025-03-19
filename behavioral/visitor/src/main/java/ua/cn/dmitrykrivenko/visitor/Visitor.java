package ua.cn.dmitrykrivenko.visitor;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface Visitor {

    public void visit(City city);

    public void visit(Museum museum);

    public void visit(Park park);
}
