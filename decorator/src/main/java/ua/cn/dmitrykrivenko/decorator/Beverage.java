package ua.cn.dmitrykrivenko.decorator;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
