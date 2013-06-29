package ua.cn.dmitrykrivenko.virtual.proxy;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class RealImage implements Image {

    private String filename = null;

    public RealImage(final String fileName) {
        filename = fileName;
    }

    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}
