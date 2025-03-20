package ua.cn.dmitrykrivenko.command;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface Command {

    void execute();

    void undo();
}
