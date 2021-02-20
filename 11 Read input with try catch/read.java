//Q.Read a number and display it?

import java.io.*;
import java.lang.*;
public class read
{
	public static void main(String args[])
	{	
		String str;
		int x;
		try
		{
			DataInputStream dis;
			dis= new DataInputStream(System.in);	 //or DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter x");
			str=dis.readLine();
			x=Integer.parseInt(str);
			System.out.println("x= "+ x);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}
}

