//Q.Read a Character and display it?

import java.io.*;
import java.lang.*;
public class read
{
	public static void main(String args[])
	{	
		String str;
		char c;
		try
		{
			DataInputStream dis;
			dis= new DataInputStream(System.in);	 //or DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter x");
			c=(char)dis.read();
			System.out.println("x= "+ c);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}
}

