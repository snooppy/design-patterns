package ua.cn.dmitrykrivenko.remoye.roxy.client;

import org.junit.Assert;
import org.junit.Test;

import ua.cn.dmitrykrivenko.remote.proxy.client.MyRemoteClient;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class RemoteProxyTest {

    @Test
    public void testRemoteProxy() {
        MyRemoteClient client = new MyRemoteClient();
        Assert.assertEquals("Hello from Server!", client.getHelloStringFromServer());
    }
}
