package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part7 extends Applet {
	Button b1,b2;
	static TextField t;
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener(new H());
		b2.addActionListener(new I());
		}
}
class H implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
	Applet2Part7.t.setText("Hello World");
	}
}

class I implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
	Applet2Part7.t.setText("");
	}
}

	