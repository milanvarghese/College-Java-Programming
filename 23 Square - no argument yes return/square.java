//Q. Write a program to find the square of a number using a function
//passing no argument no return

import java.io.*;

class Test
{
	public int sqr()
	{
		int n=0;
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter a number: ");
			n=Integer.parseInt(dis.readLine());
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return(n*n);
	}
}

public class square  //yes argument no return 
{
	public static void main(String args[])
	{
		Test t=new Test();
		int s=t.sqr(); //argument pass
		System.out.println(s);
	}
}
