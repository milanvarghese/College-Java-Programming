//Q. Write a program to find the square of a number using a function
//passing  argument return

import java.io.*;

class Test
{
	public int sqr(int n)
	{
		int s=n*n;
		return(s);
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
			int s=t.sqr(x); //argument pass
			System.out.println(s);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
}
