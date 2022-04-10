package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part9 extends Applet {
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		H h = new H();
		h.takeRef(this);
		b1.addActionListener(h);
		b2.addActionListener(new I(this));
		}
}
class H implements ActionListener{
	Applet2Part9 ap;
	
	public void takeRef(Applet2Part9 ap) {
	this.ap = ap;
	}
	
	public void actionPerformed(ActionEvent e) {
	ap.t.setText("Hello World");
	}
}

class I implements ActionListener{
	Applet2Part9 ap;
	
	public I(Applet2Part9 ap) {
	this.ap = ap;
	}
	
	public void actionPerformed(ActionEvent e) {
	ap.t.setText("");
	}
}
