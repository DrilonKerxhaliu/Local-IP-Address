package Collection;

import java.net.*; 

public class YourLocalIP {

	public static void main(String[] args) { 
		try { 
			InetAddress addressIP = InetAddress.getLocalHost();
			System.out.println("IP address: " + addressIP.getHostAddress());
			System.out.println("Host name : " + addressIP.getHostName());  
		} 
		catch (UnknownHostException unkEx) { 
			System.out.println( "You dont have a local IP address!"); 
		} 
	} 

}
