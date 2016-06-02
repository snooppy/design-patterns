package ua.cn.dmitrykrivenko.command;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class NoCommand implements Command {

	@Override
    public void execute() {
    }

	@Override
    public void undo() {
    }
}
