package ua.cn.dmitrykrivenko.decorator;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
