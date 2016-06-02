package ua.cn.dmitrykrivenko.command.stereo;

import ua.cn.dmitrykrivenko.command.Command;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class StereoOffCommand implements Command {

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

	@Override
    public void execute() {
        stereo.off();
    }

	@Override
    public void undo() {
        stereo.on();
    }
}
