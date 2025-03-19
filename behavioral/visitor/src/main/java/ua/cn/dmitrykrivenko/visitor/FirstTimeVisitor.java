package ua.cn.dmitrykrivenko.visitor;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class FirstTimeVisitor implements Visitor {

    @Override
    public void visit(City city) {
        System.out.println("I'm visiting the city!");
    }

    @Override
    public void visit(Museum museum) {
        System.out.println("I'm visiting the Museum!");
    }

    @Override
    public void visit(Park park) {
        System.out.println("I'm visiting the Park!");
    }
}
