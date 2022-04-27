package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet1Demo2 extends Applet {
	Button b1, b2; 
	TextField t;
	
	public void init() {
		b1 = new Button();
		b2 = new Button();
		t = new TextField();
		add(b1,b2);
		add(t);
		
	}
}