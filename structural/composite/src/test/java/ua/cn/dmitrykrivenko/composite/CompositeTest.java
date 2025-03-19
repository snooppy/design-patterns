package ua.cn.dmitrykrivenko.composite;

import org.junit.Test;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class CompositeTest {

    @Test
    public void testComposite() {
        //Initialize four ellipses
        Ellipse ellipse = new Ellipse();
        Rectangle rectangle = new Rectangle();

        //Initialize three composite graphics
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        for (int i = 0; i < 3; i++) {
            graphic1.add(ellipse);
        }
        for (int i = 0; i < 3; i++) {
            graphic2.add(rectangle);
        }

        graphic.add(graphic1);
        graphic.add(graphic2);

        //Prints the complete graphic (3 times the string "Ellipse" and 
        //3 times the string "Rectangle").
        graphic.print();
    }
}
