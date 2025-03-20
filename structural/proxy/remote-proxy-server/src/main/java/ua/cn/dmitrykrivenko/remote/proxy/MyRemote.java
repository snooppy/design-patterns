package ua.cn.dmitrykrivenko.remote.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface MyRemote extends Remote {

    String sayHello() throws RemoteException;
}
