package ua.cn.dmitrykrivenko.command;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface Command {

    public void execute();

    public void undo();
}
