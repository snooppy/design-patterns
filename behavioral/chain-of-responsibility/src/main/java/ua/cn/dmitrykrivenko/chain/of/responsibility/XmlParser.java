package ua.cn.dmitrykrivenko.chain.of.responsibility;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class XmlParser extends Parser {

    @Override
    public boolean parse(String fileName) {
        if (canHandleFile(fileName, ".xml")) {
            System.out.println("A XML parser is handling the file: " + fileName);
            return true;
        } else {
            return super.parse(fileName);
        }
    }
}
