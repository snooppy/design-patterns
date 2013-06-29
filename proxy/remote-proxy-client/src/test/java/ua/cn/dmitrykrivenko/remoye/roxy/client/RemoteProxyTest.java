package ua.cn.dmitrykrivenko.remoye.roxy.client;

import org.junit.Assert;
import org.junit.Test;
import ua.cn.dmitrykrivenko.remote.proxy.client.MyRemoteClient;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class RemoteProxyTest {

    @Test
    public void testRemoteProxy() {
        MyRemoteClient client = new MyRemoteClient();
        Assert.assertEquals(client.getHelloStringFromServer(), "Hello from Server!");
    }
}
