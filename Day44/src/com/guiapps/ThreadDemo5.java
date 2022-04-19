package com.guiapps;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo5 extends Frame {
	TextField t1,t2;
	
	public ThreadDemo5() {
		setLayout(new FlowLayout());
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			});
		setSize(400,500);
		setVisible(true);
		
}
	
	public static void main(String[] args) {
		new ThreadDemo5();
	}
}

