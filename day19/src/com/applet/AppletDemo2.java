package com.applet;
import java.applet.Applet;
import java.awt.Graphics;
 
public class AppletDemo2 extends Applet{
 
 public void paint(Graphics g){
 /*
 * Show status message in an Applet window using
 * void showStatus(String msg) method of an applet class.
 */
 
 //this will be displayed inside an applet
 g.drawString("Show Status Example", 50, 50);
 
 //this will be displayed in a status bar of an applet window
 showStatus("This is a status message of an applet window");

 }

}