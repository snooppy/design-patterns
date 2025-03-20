package ua.cn.dmitrykrivenko.remote.proxy.server;

import ua.cn.dmitrykrivenko.remote.proxy.MyRemote;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    // for using on the localhost
    static {
       try
       {
          Path basePath = Paths.get(MyRemoteImpl.class.getProtectionDomain()
                   .getCodeSource()
                   .getLocation()
                   .toURI());
          String separator = System.getProperty("file.separator");
           Path projectRoot = basePath.getParent().getParent();
          String policyFile = projectRoot.toString() + separator + "src"
                   + separator + "main" + separator + "resources" + separator + "rmi.policy";
           System.setProperty("java.security.policy", policyFile);
       }
       catch (URISyntaxException e)
       {
          throw new RuntimeException(e);
       }

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
