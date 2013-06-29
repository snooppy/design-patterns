package ua.cn.dmitrykrivenko.command;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public interface Command {

    public void execute();

    public void undo();
}
