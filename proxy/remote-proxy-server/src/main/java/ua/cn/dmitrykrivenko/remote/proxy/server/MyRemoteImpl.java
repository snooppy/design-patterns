package ua.cn.dmitrykrivenko.remote.proxy.server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import ua.cn.dmitrykrivenko.remote.proxy.MyRemote;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

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

    public MyRemoteImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello from Server!";
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("rmi://localhost/RemoteHello", service);
            System.out.println("Server bound...");
        } catch (Exception ex) {
            System.err.println("Server exception: " + ex.getMessage());
            System.out.print(ex);
        }
    }
}
