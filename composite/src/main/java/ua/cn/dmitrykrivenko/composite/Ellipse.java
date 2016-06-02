package ua.cn.dmitrykrivenko.composite;

/**
 * Leaf.
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class Ellipse implements Graphic {

	@Override
    public void print() {
        System.out.println("Ellipse");
    }
}
