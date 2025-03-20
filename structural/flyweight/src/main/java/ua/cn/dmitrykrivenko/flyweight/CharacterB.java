package ua.cn.dmitrykrivenko.flyweight;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class CharacterB extends EnglishCharacter {

    public CharacterB() {
        symbol = 'B';
        width = 20;
        height = 30;
    }

    @Override
    public char printCharacter() {
        System.out.println("Symbol = " + symbol + " Width = " + width + " Height = " + height);
          return symbol;
    }
}
