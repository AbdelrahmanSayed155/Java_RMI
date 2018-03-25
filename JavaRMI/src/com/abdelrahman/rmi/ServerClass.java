/**
 * 
 */
package com.abdelrahman.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 25, 2018
 */
public class ServerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Adder stud = new AdderRemoteClass();
				Naming.rebind("rmi://localhost:6000/abdelrahman", stud);
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
