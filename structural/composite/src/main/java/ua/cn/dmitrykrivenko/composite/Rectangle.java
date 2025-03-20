package ua.cn.dmitrykrivenko.composite;

/**
 * Leaf.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Rectangle implements Graphic {

   @Override
   public void print() {
        System.out.println("Rectangle");
    }
}
