package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part8 extends Applet {
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		H h = new H();
		I i = new I();
		b1.addActionListener(new H());
		b2.addActionListener(new I());
		}
}
class H implements ActionListener{
	Applet2Part8 a;
	
	public void takeRef(Applet2Part8 ap) {
		a = ap;
	}
	public void actionPerformed(ActionEvent e) {
	a.t.setText("Hello World");
	}
}

class I implements ActionListener{
	Applet2Part8 a;
	
	public void takeRef(Applet2Part8 ap) {
		a = ap;
	}
	public void actionPerformed(ActionEvent e) {
	a.t.setText("");
	}
}

	