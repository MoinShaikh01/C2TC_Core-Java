package com.applet;
import java.applet.*;
import java.awt.*;

public class AppletDemo3 extends Applet
{
  String str;
  public void init()
  {
    str=getParameter("pname");  
    if (str == null)
    str = "Welcome to TNS Training";
    str = "Hello " + str; 
  }   
    public void paint(Graphics g)
    {
      g.drawString(str, 200, 200);
    }
}