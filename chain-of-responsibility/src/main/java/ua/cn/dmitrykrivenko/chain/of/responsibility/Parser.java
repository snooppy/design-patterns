package ua.cn.dmitrykrivenko.chain.of.responsibility;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class Parser {

    private Parser successor;

    public boolean parse(String fileName) {
        if (getSuccessor() != null) {
            return getSuccessor().parse(fileName);
        } else {
            System.out.println("Unable to find the correct parser for the file: " + fileName);
            return false;
        }
    }

    protected boolean canHandleFile(String fileName, String format) {
        return (fileName == null) || (fileName.endsWith(format));

    }

    public Parser getSuccessor() {
        return successor;
    }

    public void setNextSuccessor(Parser successor) {
        this.successor = successor;
    }
}
