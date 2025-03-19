package ua.cn.dmitrykrivenko.visitor;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Park implements Element {

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Park is accepting visitor.");
        visitor.visit(this);
    }
}
