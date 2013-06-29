package ua.cn.dmitrykrivenko.remote.proxy.client;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import ua.cn.dmitrykrivenko.remote.proxy.MyRemote;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class MyRemoteClient {

    //for using on the localhost
    static {
        String workingDir = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        System.setProperty("java.security.policy", workingDir + separator + "src"
                + separator + "main" + separator + "resources" + separator + "rmi.policy");
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
    }

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
