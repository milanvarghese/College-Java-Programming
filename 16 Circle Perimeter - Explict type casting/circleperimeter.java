//Q.Calcualte the perimeter of a circle also use explicit type casting.

import java.io.*;

class circleperimeter
{
	public static void main(String args[])
	{	
		String str;
		float r;
		int area;
		try
		{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter Radius: ");
			str=dis.readLine();
			r=Float.parseFloat(str);
			area=(int) 3.14*(int)r*(int)r;    //explicit type casting
			System.out.println("Radius: "+r);
			System.out.println("Area: "+area);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}	