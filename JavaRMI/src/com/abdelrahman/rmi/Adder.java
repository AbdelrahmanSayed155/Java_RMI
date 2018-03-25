/**
 * 
 */
package com.abdelrahman.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 25, 2018
 */
public interface Adder extends Remote{
	public int add(int x,int y) throws RemoteException;

}
