package ua.cn.dmitrykrivenko.strategy.quack;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class MuteQuack implements QuackBehavoir {

    @Override
    public String quack() {
        String quack = "Silence";
        System.out.println(quack);
        return quack;
    }
}
