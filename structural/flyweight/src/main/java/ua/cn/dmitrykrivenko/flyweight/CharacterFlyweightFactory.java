package ua.cn.dmitrykrivenko.flyweight;

import java.util.HashMap;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class CharacterFlyweightFactory {

    private final HashMap<Integer, EnglishCharacter> charactersPool = new HashMap<>();

    public EnglishCharacter getCharacter(int characterCode) {
        EnglishCharacter character = charactersPool.get(characterCode);
        if (character == null) {
            character = switch (characterCode) {
                case 1 -> new CharacterA();
                case 2 -> new CharacterB();
                case 3 -> new CharacterC();
                default -> throw new IllegalArgumentException("Unsupported character code: "
                         + characterCode);
            };
            charactersPool.put(characterCode, character);
        }
        return character;
    }
}
