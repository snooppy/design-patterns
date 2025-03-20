package ua.cn.dmitrykrivenko.remote.proxy.client;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import ua.cn.dmitrykrivenko.remote.proxy.MyRemote;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class MyRemoteClient {

    public String getHelloStringFromServer() {
        String s = null;
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
            s = service.sayHello();
            System.out.println(s);
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return s;
    }
}
