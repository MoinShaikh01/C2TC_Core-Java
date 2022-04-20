package com.guiapps;

public class ThreadDemo9 implements Runnable {

	public static void main(String[] args) {	
		String n;
		Thread t;
		Thread t1 = new Thread(new ThreadDemo9());
		t1.start();
		System.out.println("New thread: " + t1);

}
 
	@Override
	public void run() {
		 String n = null;
		try {
		     for(int i = 5; i > 0; i--) {
		     System.out.println(n + ": " + i);
		      Thread.sleep(1000);
		}
		}catch (InterruptedException e) {
		     System.out.println(n + "Interrupted");
		}
		     System.out.println(n + " exiting.");
		}
			
}


