package com.guiapps;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemoPart4 extends Frame{
	TextField t1,t2;
	public ThreadDemoPart4() {
		setLayout(new FlowLayout());
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		OutterA a = new OutterA(this);
		a.start();
		OutterB b = new OutterB(this);
		b.start();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e ) {
				System.exit(0);
			}
		});
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadDemoPart4();
	}

}
class OutterA extends Thread{
	int i;
	ThreadDemoPart4 td;
	public OutterA(ThreadDemoPart4 td) {
		this.td =td;
	}
	public void run() {
		while(true) {
			
			td.t1.setText(String.valueOf(i));
			if(i==20)
				i=0;
			else 
			    i++;
		try {
			Thread.sleep(40);
		}
		catch(Exception e) {
		}
	}
	}
	
}
class OutterB extends Thread{
	int j;
	ThreadDemoPart4 td;
	public OutterB(ThreadDemoPart4 td) {
		this.td =td;
	}
	public void run() {
		while(true) {
			
			td.t2.setText(String.valueOf(j));
			if(j==20)
				j=0;
			else 
			    j++;
		try {
			Thread.sleep(40);
		}
		catch(Exception e) {
		}
	}
	}
}
