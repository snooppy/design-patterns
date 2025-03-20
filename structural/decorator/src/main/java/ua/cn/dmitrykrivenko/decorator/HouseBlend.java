package ua.cn.dmitrykrivenko.decorator;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend coffee";
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}
