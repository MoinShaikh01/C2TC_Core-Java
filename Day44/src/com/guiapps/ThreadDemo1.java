package com.guiapps;

public class ThreadDemo1 implements Runnable {

	public static void main(String[] args) {
		
		Thread t = new Thread(new ThreadDemo1());
		t.start();
		System.out.println(t.getName());
		
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to TNS C2TC Program");
		
	}

}
