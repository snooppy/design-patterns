package ua.cn.dmitrykrivenko.virtual.proxy;

import org.junit.Test;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class VirtualProxyTest {

    @Test
    public void testVirtualProxy() {
        final Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary, already loaded
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary, already loaded
        image1.displayImage(); // loading unnecessary, already loaded
    }
}
