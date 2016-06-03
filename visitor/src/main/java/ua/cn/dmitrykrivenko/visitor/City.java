package ua.cn.dmitrykrivenko.visitor;

import java.util.ArrayList;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class City implements Element {

    ArrayList<Element> places = new ArrayList<>();

    public City() {
        places.add(new Museum());
        places.add(new Park());
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("City is accepting visitor.");
        visitor.visit(this);

        for (Element e : places) {
            e.accept(visitor);
        }
    }
}
