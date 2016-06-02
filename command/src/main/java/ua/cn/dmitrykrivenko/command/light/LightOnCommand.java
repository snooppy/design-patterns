package ua.cn.dmitrykrivenko.command.light;

import ua.cn.dmitrykrivenko.command.Command;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

	@Override
    public void execute() {
        light.on();
    }

	@Override
    public void undo() {
        light.off();
    }
}
