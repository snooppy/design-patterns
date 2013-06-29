package ua.cn.dmitrykrivenko.flyweight;

import java.util.HashMap;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class CharacterFlyweightFactory {

    private HashMap<Integer, EnglishCharacter> charactersPool = new HashMap<Integer, EnglishCharacter>();

    public EnglishCharacter getCharacter(int characterCode) {
        EnglishCharacter character = charactersPool.get(new Integer(characterCode));
        if (null == character) {
            switch (characterCode) {
                case 1: {
                    character = new CharacterA();
                    break;
                }
                case 2: {
                    character = new CharacterB();
                    break;
                }
                case 3: {
                    character = new CharacterC();
                    break;
                }
            }
            charactersPool.put(characterCode, character);
        }
        return character;
    }
}
