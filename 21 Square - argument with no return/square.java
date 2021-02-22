//Q. Write a program to find the square of a number using a function
//passing argument no return

import java.io.*;

class Test
{
	public void sqr(int a)
	{
		System.out.println("Square: "+a*a);	
	}
}

public class square  //yes argument no return 
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter a number: ");
			int x=Integer.parseInt(dis.readLine());
			System.out.println("Square: "+x);
			Test t=new Test();
			t.sqr(x); //argument pass
		}
		catch(IOException e)
		{
			System.out.println(e);
		}	
	}
}
