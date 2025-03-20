package ua.cn.dmitrykrivenko.decorator;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Milk extends BeverageDecorator {

    private final Beverage beverage;

    public Milk(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.2;
    }
}
