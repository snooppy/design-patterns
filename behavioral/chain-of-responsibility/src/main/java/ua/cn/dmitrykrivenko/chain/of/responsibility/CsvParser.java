package ua.cn.dmitrykrivenko.chain.of.responsibility;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class CsvParser extends Parser {

    public CsvParser(Parser successor) {
        super(successor);
    }

    @Override
    public boolean parse(String fileName) {
        if (canHandleFile(fileName, ".csv")) {
            System.out.println("A CSV parser is handling the file: " + fileName);
            return true;
        } else {
            return super.parse(fileName);
        }
    }
}
