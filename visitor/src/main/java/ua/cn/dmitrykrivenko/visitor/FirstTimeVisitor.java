package ua.cn.dmitrykrivenko.visitor;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class FirstTimeVisitor implements Visitor {

    public void visit(City city) {
        System.out.println("I'm visiting the city!");
    }

    public void visit(Museum museum) {
        System.out.println("I'm visiting the Museum!");
    }

    public void visit(Park park) {
        System.out.println("I'm visiting the Park!");
    }
}
