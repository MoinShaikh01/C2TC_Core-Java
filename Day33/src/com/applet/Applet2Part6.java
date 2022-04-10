package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part6 extends Applet {
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener(new H());
		}
}
class H implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
	Applet2Part6 ap = new Applet2Part6();
	ap.init();
	ap.t.setText("Hello World");
}
}
