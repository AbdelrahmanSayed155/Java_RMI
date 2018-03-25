/**
 * 
 */
package com.abdelrahman.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 25, 2018
 */
public class AdderRemoteClass extends UnicastRemoteObject implements Adder {

	/**
	 * @throws RemoteException
	 */
	public AdderRemoteClass() throws RemoteException {
		
		// TODO Auto-generated constructor stub
	}

	public int add(int x,int y) throws RemoteException{
		return x+y;
	}
}
