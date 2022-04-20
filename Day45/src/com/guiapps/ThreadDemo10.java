package com.guiapps;

public class ThreadDemo10 implements Runnable {

    public static void main(String[] args){
        Thread t1 = new Thread(new Thread(), "t1");
        Thread t2 = new Thread(new Thread(), "t2");
        
        System.out.println("Starting Runnable threads");
        t1.start();
        t2.start();
        
        System.out.println("Runnable Threads has been started");
        Thread t3 = new Thread("t3");
        Thread t4 = new Thread("t4");
        
        System.out.println("Starting MyThreads");
        t3.start();
        t4.start();
        
        System.out.println("MyThreads has been started");
        
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		new ThreadDemo10();
	}
}