package ua.cn.dmitrykrivenko.templatemethod;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Coffee extends CaffeineBeverage
{

    private boolean condiments;

    @Override
    public void brew() {
        System.out.println("Dripping coffee through the filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        return condiments;
    }

    public void setCondiments(boolean condiments) {
        this.condiments = condiments;
    }
}
