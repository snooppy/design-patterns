package ua.cn.dmitrykrivenko.command;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class NoCommand implements Command {

	@Override
    public void execute() {
    }

	@Override
    public void undo() {
    }
}
