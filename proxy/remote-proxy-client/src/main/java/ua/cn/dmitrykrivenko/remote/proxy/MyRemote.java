package ua.cn.dmitrykrivenko.remote.proxy;



import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;
}
