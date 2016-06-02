package ua.cn.dmitrykrivenko.flyweight;

import java.util.HashMap;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class CharacterFlyweightFactory {

    private final HashMap<Integer, EnglishCharacter> charactersPool = new HashMap<>();

    public EnglishCharacter getCharacter(int characterCode) {
        EnglishCharacter character = charactersPool.get(characterCode);
        if (character == null) {
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
				default:
					throw new IllegalArgumentException("Unsupported character code: "+characterCode);
            }
            charactersPool.put(characterCode, character);
        }
        return character;
    }
}
