package ua.cn.dmitrykrivenko.chain.of.responsibility;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class TextParser extends Parser {

    public TextParser(Parser successor) {
        super(successor);
    }

    @Override
    public boolean parse(String fileName) {
        if (canHandleFile(fileName, ".txt")) {
            System.out.println("A text parser is handling the file: " + fileName);
            return true;
        } else {
            return super.parse(fileName);
        }
    }
}
