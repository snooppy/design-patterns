package ua.cn.dmitrykrivenko.command.stereo;

import ua.cn.dmitrykrivenko.command.Command;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class StereoOnCommand implements Command {

    private final Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

	@Override
    public void execute() {
        stereo.on();
    }

	@Override
    public void undo() {
        stereo.off();
    }
}
