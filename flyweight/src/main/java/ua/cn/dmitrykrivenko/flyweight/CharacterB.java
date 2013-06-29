package ua.cn.dmitrykrivenko.flyweight;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class CharacterB extends EnglishCharacter {

    public CharacterB() {
        simbol = 'B';
        width = 20;
        height = 30;
    }

    @Override
    public char printCharacter() {
        System.out.println("Simbol = " + simbol + " Width = " + width + " Height = " + height);
          return simbol;
    }
}
