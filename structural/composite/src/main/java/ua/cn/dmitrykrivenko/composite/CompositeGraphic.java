package ua.cn.dmitrykrivenko.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class CompositeGraphic implements Graphic {

    //Collection of child graphics.
    private final List<Graphic> childGraphics = new ArrayList<>();

    //Prints the graphic.
	@Override
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    //Adds the graphic to the composition.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    //Removes the graphic from the composition.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
