package com.guiapps;

public class ThreadDemo2 implements Runnable {
  
  
	public static void main(String argvs[])  
	{  
   
		Thread t= new Thread("Welcome to TNS C2TC Program");  
  
 		t.start();  
  
		String str = t.getName();  
		System.out.println(str);  
		
	}
	
	public void run() {
		// TODO Auto-generated method stub
		
	}

}