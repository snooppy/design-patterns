package ua.cn.dmitrykrivenko.decorator;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Expresso extends Beverage {

    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
