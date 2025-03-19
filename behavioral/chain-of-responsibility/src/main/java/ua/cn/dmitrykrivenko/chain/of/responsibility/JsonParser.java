package ua.cn.dmitrykrivenko.chain.of.responsibility;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class JsonParser extends Parser {

    public JsonParser(Parser successor) {
        super(successor);
    }

    @Override
    public boolean parse(String fileName) {
        if (canHandleFile(fileName, ".json")) {
            System.out.println("A JSON parser is handling the file: " + fileName);
            return true;
        } else {
            return super.parse(fileName);
        }

    }
}
