//Q.Read a number and display it?

import java.io.*;
import java.lang.*
public class read
{
	public static void main(String args[])
	{	
		DataInputStream dis;
		dis= new DataInputStream(System.in); //or DataInputStream = new DataInputStream(System.in);
		System.out.println("Enter x");
		dis.readInt();
		x=dis.readInt();
		System.out.println("x= "+ x);
	}
}

