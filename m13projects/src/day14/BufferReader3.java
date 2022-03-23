package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader3{
	
	public static void main(String [] args) throws IOException{	
	// Create an object of BufferedReader using System.in.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   String str;
	System.out.println("Enter lines of text:");
	System.out.println("Enter 'end' to quit.");

		do{
		str = br.readLine(); // After reading lines of text, it gets stored in variable str.
		System.out.println(str);
		} while(!str.equals("end"));
 
	}

}

