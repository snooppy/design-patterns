package ua.cn.dmitrykrivenko.flyweight;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public abstract class EnglishCharacter {

    protected char simbol;
    protected int width;
    protected int height;

    public abstract char printCharacter();
}
