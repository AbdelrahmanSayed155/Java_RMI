/**
 * 
 */
package com.abdelrahman.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 25, 2018
 */
public class ClientClass {

	public static void main(String[] args) {
		
			Adder stud;
			
				
					try {
						stud = (Adder)Naming.lookup("rmi://localhost:6000/abdelrahman");
					System.out.print(stud.add(14, 54));
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (NotBoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
			
		

	}

}
