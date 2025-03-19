package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 * Client.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Application {

	private final GUIFactory guiFactory;
	private Button button;
	private Input input;

	public Application(GUIFactory guiFactory) {
		this.guiFactory = guiFactory;
	}

	public void createElements() {
		button = guiFactory.createButton();
		input = guiFactory.createInput();
	}

	public Button getButton() {
		return button;
	}

	public Input getInput() {
		return input;
	}

}
