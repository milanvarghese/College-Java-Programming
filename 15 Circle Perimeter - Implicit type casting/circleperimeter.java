//Q.Calcualte the perimeter of a circle also use explicit type casting.

import java.io.*;

class circleperimeter
{
	public static void main(String args[])
	{	
		String str;
		float r;
		double area;
		try
		{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter Radius: ");
			str=dis.readLine();
			r=Float.parseFloat(str);
			area=3.14*r*r;
			System.out.println("Radius: "+r);
			System.out.println("Area: "+area);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}	