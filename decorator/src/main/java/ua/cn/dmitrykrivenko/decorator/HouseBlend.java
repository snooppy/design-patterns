package ua.cn.dmitrykrivenko.decorator;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend cofee";
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}
