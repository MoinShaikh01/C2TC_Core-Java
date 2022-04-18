package com.applet;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;

public class Applet7 extends Applet {
	public void init() {
		addMouseMotionListener(new MouseMotionAdapter() {
			
		@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		showStatus(String.valueOf(x)+","+String.valueOf(y));
			}
		});		
	}
}