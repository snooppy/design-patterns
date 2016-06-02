package ua.cn.dmitrykrivenko.command.light;

import ua.cn.dmitrykrivenko.command.Command;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

	@Override
    public void execute() {
        light.off();
    }

	@Override
    public void undo() {
        light.on();
    }
}
