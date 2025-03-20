package ua.cn.dmitrykrivenko.strategy.quack;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class MuteQuack implements QuackBehavior
{

    @Override
    public String quack() {
        String quack = "Silence";
        System.out.println(quack);
        return quack;
    }
}
