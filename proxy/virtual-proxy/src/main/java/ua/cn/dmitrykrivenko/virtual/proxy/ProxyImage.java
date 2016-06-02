package ua.cn.dmitrykrivenko.virtual.proxy;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class ProxyImage implements Image {

    private RealImage image;
    private final String filename;

    public ProxyImage(final String fileName) {
        filename = fileName;
    }

	@Override
    public void displayImage() {
        if (image != null) {
            image.displayImage();
        } else {
            System.out.println("Loading image " + filename + ", please wait...");
            image = new RealImage(filename);
            image.displayImage();
        }
    }
}
