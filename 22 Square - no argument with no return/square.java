//Q. Write a program to find the square of a number using a function
//passing no argument no return

import java.io.*;

class Test
{
	public void sqr()
	{
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter a number: ");
			int n=Integer.parseInt(dis.readLine());
			int s=n*n;
			System.out.println(s);	
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}

public class square  //yes argument no return 
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.sqr(); //argument pass
	}
}
