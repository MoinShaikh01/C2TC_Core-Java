package com.guiapps;

public class ThreadDemo4 extends Thread {
	 
	public static int amount = 0;

	  public static void main(String[] args) {
		
		ThreadDemo4 thread = new ThreadDemo4();
	    thread.start();
	    
	    while(thread.isAlive()) {
	    
	    	System.out.println("Waiting for joining in the Classroom...");
	    
	  }
	  
	    System.out.println("Main: " + amount);
	    amount++;
	    System.out.println("Main: " + amount);
	    
	  }
	  
	  	public void run() {
	  		amount++;
	  }
	  
}
