package com.guiapps;

	class First {
  
		public synchronized void display(String msg)
		{
			System.out.print ("["+msg);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
			}
			System.out.println ("]");
     }
}

	class Second extends Thread
	{
		String msg;
		First fobj;
		Second (First fp,String str)
		{
			fobj = fp;
			msg = str;
			start();
		}
		
		public void run() {
		{
		  fobj.display(msg);
	    }
  }
}

	public class SyncDemo3 {
  
		public static void main (String[] args) {
		// TODO Auto-generated method stub
		
			First fnew = new First();
			new Second(fnew, "Welcome");
			new Second (fnew,"New");
			new Second(fnew, "Java Programmer");
		}
}