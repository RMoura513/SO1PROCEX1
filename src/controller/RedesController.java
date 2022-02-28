package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {

	public RedesController() {
	super();
	
	}
	String os = os();

	private String os() {
	String os = System.getProperty("os.name");
	
	if (os.contains("Windows")){
	System.out.println("O sistema operacional é Windows.");
	
	}
	System.out.println(" ");
	return os;
	}	
    
		
	public void IP(String processo) {
		try {
			Process n = Runtime.getRuntime().exec(processo);
			InputStream f = n.getInputStream();
			InputStreamReader l = new InputStreamReader(f);
			BufferedReader buffer = new BufferedReader(l);
			String li = buffer.readLine();
			while (li != null) {
			if (li.contains("Adaptador")) {
				System.out.println(li);
			}
				if (li.contains("IPv4")) {	
				System.out.println(li);
				 
				}
				li = buffer.readLine();
				}	
		
			buffer.close();
			l.close();
			f.close();
 		} catch (IOException e) {
			e.printStackTrace();
		}
			System.out.println("");
	    
	}
	
	public void Ping(String ping) {
		try {
			Process n = Runtime.getRuntime().exec(ping);
			InputStream f = n.getInputStream();
			InputStreamReader l = new InputStreamReader(f);
			BufferedReader buffer = new BufferedReader(l);
			String li = buffer.readLine();
			while (li != null) {

            if (li.contains("M‚dia")) {
            	String [] ms = li.split(",");
            	System.out.println(ms[2]);
            }
            			
		    li = buffer.readLine();		    
		    
				}	
		
			buffer.close();
			l.close();
			f.close();
 		} catch (IOException e) {
			e.printStackTrace();	
		
	}
	}
	}