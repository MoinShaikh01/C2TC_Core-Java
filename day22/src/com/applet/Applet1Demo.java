package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet1Demo extends Applet {
	Button b1, b2; 
	TextField t1, t2;
	
	public void init() {
		b1 = new Button();
		b2 = new Button();
		t1 = new TextField();
		t2 = new TextField();
		add(b1,b2);
		add(t1,t2);
		
	}
}